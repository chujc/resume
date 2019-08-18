package com.chujc.manage.resume.service.impl;

import com.chujc.manage.resume.mbg.mapper.HgCertificationsMapper;
import com.chujc.manage.resume.mbg.model.HgCertifications;
import com.chujc.manage.resume.mbg.model.HgCertificationsExample;
import com.chujc.manage.resume.service.CertificationService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CertficationServiceImpl implements CertificationService {

    @Autowired
    private HgCertificationsMapper certficationMapper;


    public int create(HgCertifications certifications) {

        return certficationMapper.insertSelective(certifications);
    }


    public List<HgCertifications> list(int pageNum, int pageSize, String name) {

        PageHelper.startPage(pageNum, pageSize);

        HgCertificationsExample example = new HgCertificationsExample();

        if(!(name == null || name.length() == 0)){
            example.createCriteria().andNameLike("%"+name+"%");
        }

        return certficationMapper.selectByExample(example);
    }
}
