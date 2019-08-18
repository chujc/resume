package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserProjectExperiences;
import com.chujc.manage.resume.mbg.model.HgUserProjectExperiencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserProjectExperiencesMapper {
    long countByExample(HgUserProjectExperiencesExample example);

    int deleteByExample(HgUserProjectExperiencesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HgUserProjectExperiences record);

    int insertSelective(HgUserProjectExperiences record);

    List<HgUserProjectExperiences> selectByExampleWithBLOBs(HgUserProjectExperiencesExample example);

    List<HgUserProjectExperiences> selectByExample(HgUserProjectExperiencesExample example);

    HgUserProjectExperiences selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HgUserProjectExperiences record, @Param("example") HgUserProjectExperiencesExample example);

    int updateByExampleWithBLOBs(@Param("record") HgUserProjectExperiences record, @Param("example") HgUserProjectExperiencesExample example);

    int updateByExample(@Param("record") HgUserProjectExperiences record, @Param("example") HgUserProjectExperiencesExample example);

    int updateByPrimaryKeySelective(HgUserProjectExperiences record);

    int updateByPrimaryKeyWithBLOBs(HgUserProjectExperiences record);

    int updateByPrimaryKey(HgUserProjectExperiences record);
}