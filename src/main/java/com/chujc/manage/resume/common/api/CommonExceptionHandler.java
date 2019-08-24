package com.chujc.manage.resume.common.api;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.hibernate.validator.internal.engine.path.PathImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Controller 统一返回包装
 *
 * @author 单红宇
 * @date 2019年6月26日
 *
 */
@ControllerAdvice
@ResponseBody
public class CommonExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

    /**
     * Validator 参数校验异常处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(BindException.class)
    public ResponseEntity<Object> handleMethodVoArgumentNotValidException(BindException ex) {
        FieldError err = ex.getFieldError();
        // err.getField() 读取参数字段
        // err.getDefaultMessage() 读取验证注解中的message值
        String message = "参数{".concat(err.getField()).concat("}").concat(err.getDefaultMessage());
        logger.info("{} -> {}", err.getObjectName(), message);


        Map<String, List> map = new HashMap<String, List>();

        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            List list = new ArrayList();
            list.add(error.getDefaultMessage());
            map.put(ex.getFieldError().getField(), list);
        }

        return new ResponseEntity<Object>(new CommonResult(ResultCode.VALIDATE_FAILED.getCode(), message, map), HttpStatus.OK);
    }

    /**
     * Validator 参数校验异常处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleMethodArgumentNotValidException(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
        for (ConstraintViolation<?> constraintViolation : constraintViolations) {
            PathImpl pathImpl = (PathImpl) constraintViolation.getPropertyPath();
            // 读取参数字段，constraintViolation.getMessage() 读取验证注解中的message值
            String paramName = pathImpl.getLeafNode().getName();
            String message = "参数{".concat(paramName).concat("}").concat(constraintViolation.getMessage());
            logger.info("{} -> {} -> {}", constraintViolation.getRootBeanClass().getName(), pathImpl.toString(), message);
            return new ResponseEntity<Object>(new CommonResult(ResultCode.VALIDATE_FAILED.getCode(), message, null), HttpStatus.OK);
        }
        return new ResponseEntity<Object>(new CommonResult(ResultCode.VALIDATE_FAILED.getCode(), ex.getMessage(), null), HttpStatus.OK);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult handleBindException(MethodArgumentNotValidException ex) {

        ex.getBindingResult().getAllErrors();
        ex.getBindingResult().getFieldErrors();

        FieldError fieldError = ex.getBindingResult().getFieldError();
        logger.info("参数校验异常:{}({})", fieldError.getDefaultMessage(),fieldError.getField());


        logger.info("");

        CommonResult commonResult;

        commonResult = CommonResult.validateFailed("asd", ex.getBindingResult().getFieldErrors());

        return commonResult;
    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public  CommonResult handleValidationExceptions(
//            MethodArgumentNotValidException ex) {
//        CommonResult commonResult;
//
//
//        String errorMsg = ex.getBindingResult().getAllErrors().stream()
//                .map(DefaultMessageSourceResolvable::getDefaultMessage)
//                .collect(Collectors.joining("\n", "[", "]"));
//
//        commonResult = CommonResult.failed(errorMsg);
//
//        return commonResult;
//    }

}