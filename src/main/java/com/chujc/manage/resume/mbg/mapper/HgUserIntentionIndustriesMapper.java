package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserIntentionIndustries;
import com.chujc.manage.resume.mbg.model.HgUserIntentionIndustriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserIntentionIndustriesMapper {
    long countByExample(HgUserIntentionIndustriesExample example);

    int deleteByExample(HgUserIntentionIndustriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HgUserIntentionIndustries record);

    int insertSelective(HgUserIntentionIndustries record);

    List<HgUserIntentionIndustries> selectByExample(HgUserIntentionIndustriesExample example);

    HgUserIntentionIndustries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HgUserIntentionIndustries record, @Param("example") HgUserIntentionIndustriesExample example);

    int updateByExample(@Param("record") HgUserIntentionIndustries record, @Param("example") HgUserIntentionIndustriesExample example);

    int updateByPrimaryKeySelective(HgUserIntentionIndustries record);

    int updateByPrimaryKey(HgUserIntentionIndustries record);
}