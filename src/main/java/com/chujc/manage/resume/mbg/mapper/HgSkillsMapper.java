package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgSkills;
import com.chujc.manage.resume.mbg.model.HgSkillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgSkillsMapper {
    long countByExample(HgSkillsExample example);

    int deleteByExample(HgSkillsExample example);

    int deleteByPrimaryKey(Integer skillId);

    int insert(HgSkills record);

    int insertSelective(HgSkills record);

    List<HgSkills> selectByExample(HgSkillsExample example);

    HgSkills selectByPrimaryKey(Integer skillId);

    int updateByExampleSelective(@Param("record") HgSkills record, @Param("example") HgSkillsExample example);

    int updateByExample(@Param("record") HgSkills record, @Param("example") HgSkillsExample example);

    int updateByPrimaryKeySelective(HgSkills record);

    int updateByPrimaryKey(HgSkills record);
}