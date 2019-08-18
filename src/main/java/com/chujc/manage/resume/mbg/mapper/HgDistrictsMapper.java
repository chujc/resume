package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgDistricts;
import com.chujc.manage.resume.mbg.model.HgDistrictsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgDistrictsMapper {
    long countByExample(HgDistrictsExample example);

    int deleteByExample(HgDistrictsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HgDistricts record);

    int insertSelective(HgDistricts record);

    List<HgDistricts> selectByExample(HgDistrictsExample example);

    HgDistricts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HgDistricts record, @Param("example") HgDistrictsExample example);

    int updateByExample(@Param("record") HgDistricts record, @Param("example") HgDistrictsExample example);

    int updateByPrimaryKeySelective(HgDistricts record);

    int updateByPrimaryKey(HgDistricts record);
}