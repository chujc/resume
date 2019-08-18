package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUserOauth;
import com.chujc.manage.resume.mbg.model.HgUserOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUserOauthMapper {
    long countByExample(HgUserOauthExample example);

    int deleteByExample(HgUserOauthExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("city") String city);

    int insert(HgUserOauth record);

    int insertSelective(HgUserOauth record);

    List<HgUserOauth> selectByExampleWithBLOBs(HgUserOauthExample example);

    List<HgUserOauth> selectByExample(HgUserOauthExample example);

    HgUserOauth selectByPrimaryKey(@Param("id") Integer id, @Param("city") String city);

    int updateByExampleSelective(@Param("record") HgUserOauth record, @Param("example") HgUserOauthExample example);

    int updateByExampleWithBLOBs(@Param("record") HgUserOauth record, @Param("example") HgUserOauthExample example);

    int updateByExample(@Param("record") HgUserOauth record, @Param("example") HgUserOauthExample example);

    int updateByPrimaryKeySelective(HgUserOauth record);

    int updateByPrimaryKeyWithBLOBs(HgUserOauth record);

    int updateByPrimaryKey(HgUserOauth record);
}