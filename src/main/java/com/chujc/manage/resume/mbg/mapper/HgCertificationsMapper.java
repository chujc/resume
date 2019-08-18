package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgCertifications;
import com.chujc.manage.resume.mbg.model.HgCertificationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgCertificationsMapper {
    long countByExample(HgCertificationsExample example);

    int deleteByExample(HgCertificationsExample example);

    int deleteByPrimaryKey(Integer certificationId);

    int insert(HgCertifications record);

    int insertSelective(HgCertifications record);

    List<HgCertifications> selectByExample(HgCertificationsExample example);

    HgCertifications selectByPrimaryKey(Integer certificationId);

    int updateByExampleSelective(@Param("record") HgCertifications record, @Param("example") HgCertificationsExample example);

    int updateByExample(@Param("record") HgCertifications record, @Param("example") HgCertificationsExample example);

    int updateByPrimaryKeySelective(HgCertifications record);

    int updateByPrimaryKey(HgCertifications record);
}