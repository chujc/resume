package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgSchools;
import com.chujc.manage.resume.mbg.model.HgSchoolsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgSchoolsMapper {
    long countByExample(HgSchoolsExample example);

    int deleteByExample(HgSchoolsExample example);

    int deleteByPrimaryKey(Integer schoolId);

    int insert(HgSchools record);

    int insertSelective(HgSchools record);

    List<HgSchools> selectByExample(HgSchoolsExample example);

    HgSchools selectByPrimaryKey(Integer schoolId);

    int updateByExampleSelective(@Param("record") HgSchools record, @Param("example") HgSchoolsExample example);

    int updateByExample(@Param("record") HgSchools record, @Param("example") HgSchoolsExample example);

    int updateByPrimaryKeySelective(HgSchools record);

    int updateByPrimaryKey(HgSchools record);
}