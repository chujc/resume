package com.chujc.manage.resume.service.impl;

import com.chujc.manage.resume.mbg.mapper.HgCompanysMapper;
import com.chujc.manage.resume.mbg.model.HgCompanys;
import com.chujc.manage.resume.mbg.model.HgCompanysExample;
import com.chujc.manage.resume.service.CompanyService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private HgCompanysMapper companysMapper;


    @Override
    public int create(HgCompanys company) {
        return companysMapper.insertSelective(company);
    }

    @Override
    public int delete(Integer id) {
        return companysMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Integer id, HgCompanys company) {
        company.setCompanyId(id);
        return companysMapper.updateByPrimaryKeySelective(company);
    }

    @Override
    public List<HgCompanys> index(int pageNum, int pageSize, String name) {
        PageHelper.startPage(pageNum, pageSize);

        HgCompanysExample example = new HgCompanysExample();

        if(!(name == null || name.length() == 0)){
            example.createCriteria().andNameLike("%"+name+"%");
        }
        return companysMapper.selectByExample(example);
    }
}
