package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgSmsLog;
import com.chujc.manage.resume.mbg.model.HgSmsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgSmsLogMapper {
    long countByExample(HgSmsLogExample example);

    int deleteByExample(HgSmsLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HgSmsLog record);

    int insertSelective(HgSmsLog record);

    List<HgSmsLog> selectByExample(HgSmsLogExample example);

    HgSmsLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HgSmsLog record, @Param("example") HgSmsLogExample example);

    int updateByExample(@Param("record") HgSmsLog record, @Param("example") HgSmsLogExample example);

    int updateByPrimaryKeySelective(HgSmsLog record);

    int updateByPrimaryKey(HgSmsLog record);
}