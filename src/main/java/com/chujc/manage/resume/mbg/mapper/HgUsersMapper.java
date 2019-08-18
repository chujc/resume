package com.chujc.manage.resume.mbg.mapper;

import com.chujc.manage.resume.mbg.model.HgUsers;
import com.chujc.manage.resume.mbg.model.HgUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HgUsersMapper {
    long countByExample(HgUsersExample example);

    int deleteByExample(HgUsersExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(HgUsers record);

    int insertSelective(HgUsers record);

    List<HgUsers> selectByExample(HgUsersExample example);

    HgUsers selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") HgUsers record, @Param("example") HgUsersExample example);

    int updateByExample(@Param("record") HgUsers record, @Param("example") HgUsersExample example);

    int updateByPrimaryKeySelective(HgUsers record);

    int updateByPrimaryKey(HgUsers record);
}