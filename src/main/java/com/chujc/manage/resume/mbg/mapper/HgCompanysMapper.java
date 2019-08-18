package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgCompanys;
import com.chujc.manage.resume.mbg.model.HgCompanysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgCompanysMapper {
    long countByExample(HgCompanysExample example);

    int deleteByExample(HgCompanysExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(HgCompanys record);

    int insertSelective(HgCompanys record);

    List<HgCompanys> selectByExample(HgCompanysExample example);

    HgCompanys selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") HgCompanys record, @Param("example") HgCompanysExample example);

    int updateByExample(@Param("record") HgCompanys record, @Param("example") HgCompanysExample example);

    int updateByPrimaryKeySelective(HgCompanys record);

    int updateByPrimaryKey(HgCompanys record);
}