package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgPositions;
import com.chujc.manage.resume.mbg.model.HgPositionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgPositionsMapper {
    long countByExample(HgPositionsExample example);

    int deleteByExample(HgPositionsExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(HgPositions record);

    int insertSelective(HgPositions record);

    List<HgPositions> selectByExample(HgPositionsExample example);

    HgPositions selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") HgPositions record, @Param("example") HgPositionsExample example);

    int updateByExample(@Param("record") HgPositions record, @Param("example") HgPositionsExample example);

    int updateByPrimaryKeySelective(HgPositions record);

    int updateByPrimaryKey(HgPositions record);
}