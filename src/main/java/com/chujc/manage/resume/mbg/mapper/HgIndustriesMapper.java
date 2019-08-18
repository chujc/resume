package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgIndustries;
import com.chujc.manage.resume.mbg.model.HgIndustriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgIndustriesMapper {
    long countByExample(HgIndustriesExample example);

    int deleteByExample(HgIndustriesExample example);

    int deleteByPrimaryKey(Integer industryId);

    int insert(HgIndustries record);

    int insertSelective(HgIndustries record);

    List<HgIndustries> selectByExample(HgIndustriesExample example);

    HgIndustries selectByPrimaryKey(Integer industryId);

    int updateByExampleSelective(@Param("record") HgIndustries record, @Param("example") HgIndustriesExample example);

    int updateByExample(@Param("record") HgIndustries record, @Param("example") HgIndustriesExample example);

    int updateByPrimaryKeySelective(HgIndustries record);

    int updateByPrimaryKey(HgIndustries record);
}