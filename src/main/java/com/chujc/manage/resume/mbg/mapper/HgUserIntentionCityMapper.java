package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserIntentionCity;
import com.chujc.manage.resume.mbg.model.HgUserIntentionCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserIntentionCityMapper {
    long countByExample(HgUserIntentionCityExample example);

    int deleteByExample(HgUserIntentionCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HgUserIntentionCity record);

    int insertSelective(HgUserIntentionCity record);

    List<HgUserIntentionCity> selectByExample(HgUserIntentionCityExample example);

    HgUserIntentionCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HgUserIntentionCity record, @Param("example") HgUserIntentionCityExample example);

    int updateByExample(@Param("record") HgUserIntentionCity record, @Param("example") HgUserIntentionCityExample example);

    int updateByPrimaryKeySelective(HgUserIntentionCity record);

    int updateByPrimaryKey(HgUserIntentionCity record);
}