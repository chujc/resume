package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserSkills;
import com.chujc.manage.resume.mbg.model.HgUserSkillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserSkillsMapper {
    long countByExample(HgUserSkillsExample example);

    int deleteByExample(HgUserSkillsExample example);

    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("skillId") Integer skillId);

    int insert(HgUserSkills record);

    int insertSelective(HgUserSkills record);

    List<HgUserSkills> selectByExample(HgUserSkillsExample example);

    HgUserSkills selectByPrimaryKey(@Param("userId") Integer userId, @Param("skillId") Integer skillId);

    int updateByExampleSelective(@Param("record") HgUserSkills record, @Param("example") HgUserSkillsExample example);

    int updateByExample(@Param("record") HgUserSkills record, @Param("example") HgUserSkillsExample example);

    int updateByPrimaryKeySelective(HgUserSkills record);

    int updateByPrimaryKey(HgUserSkills record);
}