package com.chujc.manage.resume.controller;

import com.chujc.manage.resume.common.api.CommonPage;
import com.chujc.manage.resume.common.api.CommonResult;
import com.chujc.manage.resume.mbg.model.HgCompanys;
import com.chujc.manage.resume.service.CompanyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@Api(tags = "CompanyController", description = "公司管理")
@RestController
@RequestMapping(value = "company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @ApiOperation("添加公司")
    @PostMapping(value = "/")
    public CommonResult create (@RequestBody @Valid HgCompanys company) {
        CommonResult commonResult;
        int count = companyService.create(company);
        if (count == 1) {
            commonResult = CommonResult.success(company);
        } else {
            commonResult = CommonResult.failed("操作失败");
        }
        return commonResult;
    }


    @ApiOperation("公司列表")
    @GetMapping(value = "/")
    public CommonResult<CommonPage<HgCompanys>> index(@RequestParam(value = "pageNum", defaultValue = "1")
                                                        @ApiParam("页码") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "20")
                                                        @ApiParam("每页数量") Integer pageSize,
                                                        @RequestParam(value = "name", defaultValue = "")
                                                        @ApiParam("证书名称") String name
                                                        ) {

        List<HgCompanys> companys = companyService.index(pageNum, pageSize, name);

        return CommonResult.success(CommonPage.restPage(companys));
    }

    @ApiOperation("删除公司")
    @DeleteMapping(value = "/")
    public CommonResult delete(@RequestParam(value = "id") Integer id) {
        CommonResult commonResult;
        int count = companyService.delete(id);
        if (count == 1) {
            commonResult = CommonResult.success("删除成功");
        } else {
            commonResult = CommonResult.failed("删除失败");
        }
        return  commonResult;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public  CommonResult handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        CommonResult commonResult;


        String errorMsg = ex.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .collect(Collectors.joining("\n", "[", "]"));


        commonResult = CommonResult.failed(errorMsg);

        return commonResult;
    }

}
