package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserWorkExperiences;
import com.chujc.manage.resume.mbg.model.HgUserWorkExperiencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserWorkExperiencesMapper {
    long countByExample(HgUserWorkExperiencesExample example);

    int deleteByExample(HgUserWorkExperiencesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HgUserWorkExperiences record);

    int insertSelective(HgUserWorkExperiences record);

    List<HgUserWorkExperiences> selectByExampleWithBLOBs(HgUserWorkExperiencesExample example);

    List<HgUserWorkExperiences> selectByExample(HgUserWorkExperiencesExample example);

    HgUserWorkExperiences selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HgUserWorkExperiences record, @Param("example") HgUserWorkExperiencesExample example);

    int updateByExampleWithBLOBs(@Param("record") HgUserWorkExperiences record, @Param("example") HgUserWorkExperiencesExample example);

    int updateByExample(@Param("record") HgUserWorkExperiences record, @Param("example") HgUserWorkExperiencesExample example);

    int updateByPrimaryKeySelective(HgUserWorkExperiences record);

    int updateByPrimaryKeyWithBLOBs(HgUserWorkExperiences record);

    int updateByPrimaryKey(HgUserWorkExperiences record);
}