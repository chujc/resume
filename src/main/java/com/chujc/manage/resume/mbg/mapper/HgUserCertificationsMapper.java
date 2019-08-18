package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserCertifications;
import com.chujc.manage.resume.mbg.model.HgUserCertificationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserCertificationsMapper {
    long countByExample(HgUserCertificationsExample example);

    int deleteByExample(HgUserCertificationsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HgUserCertifications record);

    int insertSelective(HgUserCertifications record);

    List<HgUserCertifications> selectByExample(HgUserCertificationsExample example);

    HgUserCertifications selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HgUserCertifications record, @Param("example") HgUserCertificationsExample example);

    int updateByExample(@Param("record") HgUserCertifications record, @Param("example") HgUserCertificationsExample example);

    int updateByPrimaryKeySelective(HgUserCertifications record);

    int updateByPrimaryKey(HgUserCertifications record);
}