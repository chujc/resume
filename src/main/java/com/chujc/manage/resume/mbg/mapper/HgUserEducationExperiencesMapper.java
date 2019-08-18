package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserEducationExperiences;
import com.chujc.manage.resume.mbg.model.HgUserEducationExperiencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserEducationExperiencesMapper {
    long countByExample(HgUserEducationExperiencesExample example);

    int deleteByExample(HgUserEducationExperiencesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HgUserEducationExperiences record);

    int insertSelective(HgUserEducationExperiences record);

    List<HgUserEducationExperiences> selectByExampleWithBLOBs(HgUserEducationExperiencesExample example);

    List<HgUserEducationExperiences> selectByExample(HgUserEducationExperiencesExample example);

    HgUserEducationExperiences selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HgUserEducationExperiences record, @Param("example") HgUserEducationExperiencesExample example);

    int updateByExampleWithBLOBs(@Param("record") HgUserEducationExperiences record, @Param("example") HgUserEducationExperiencesExample example);

    int updateByExample(@Param("record") HgUserEducationExperiences record, @Param("example") HgUserEducationExperiencesExample example);

    int updateByPrimaryKeySelective(HgUserEducationExperiences record);

    int updateByPrimaryKeyWithBLOBs(HgUserEducationExperiences record);

    int updateByPrimaryKey(HgUserEducationExperiences record);
}