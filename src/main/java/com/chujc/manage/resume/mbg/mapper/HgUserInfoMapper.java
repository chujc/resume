package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserInfo;
import com.chujc.manage.resume.mbg.model.HgUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserInfoMapper {
    long countByExample(HgUserInfoExample example);

    int deleteByExample(HgUserInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(HgUserInfo record);

    int insertSelective(HgUserInfo record);

    List<HgUserInfo> selectByExampleWithBLOBs(HgUserInfoExample example);

    List<HgUserInfo> selectByExample(HgUserInfoExample example);

    HgUserInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") HgUserInfo record, @Param("example") HgUserInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") HgUserInfo record, @Param("example") HgUserInfoExample example);

    int updateByExample(@Param("record") HgUserInfo record, @Param("example") HgUserInfoExample example);

    int updateByPrimaryKeySelective(HgUserInfo record);

    int updateByPrimaryKeyWithBLOBs(HgUserInfo record);

    int updateByPrimaryKey(HgUserInfo record);
}