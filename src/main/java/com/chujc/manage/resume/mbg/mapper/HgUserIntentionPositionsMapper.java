package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserIntentionPositions;
import com.chujc.manage.resume.mbg.model.HgUserIntentionPositionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserIntentionPositionsMapper {
    long countByExample(HgUserIntentionPositionsExample example);

    int deleteByExample(HgUserIntentionPositionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HgUserIntentionPositions record);

    int insertSelective(HgUserIntentionPositions record);

    List<HgUserIntentionPositions> selectByExample(HgUserIntentionPositionsExample example);

    HgUserIntentionPositions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HgUserIntentionPositions record, @Param("example") HgUserIntentionPositionsExample example);

    int updateByExample(@Param("record") HgUserIntentionPositions record, @Param("example") HgUserIntentionPositionsExample example);

    int updateByPrimaryKeySelective(HgUserIntentionPositions record);

    int updateByPrimaryKey(HgUserIntentionPositions record);
}