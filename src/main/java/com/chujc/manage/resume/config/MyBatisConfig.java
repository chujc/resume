package com.chujc.manage.resume.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.chujc.manage.resume.mbg.mapper","com.chujc.manage.resume.dao"})
public class MyBatisConfig {
}
