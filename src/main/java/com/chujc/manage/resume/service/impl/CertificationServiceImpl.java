package com.chujc.manage.resume.service.impl;

import com.chujc.manage.resume.mbg.mapper.HgCertificationsMapper;
import com.chujc.manage.resume.mbg.model.HgCertifications;
import com.chujc.manage.resume.mbg.model.HgCertificationsExample;
import com.chujc.manage.resume.service.CertificationService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationServiceImpl implements CertificationService {

    @Autowired
    private HgCertificationsMapper certficationMapper;

    @Override
    public int create(HgCertifications certifications) {

        return certficationMapper.insertSelective(certifications);
    }


    @Override
    public List<HgCertifications> index(int pageNum, int pageSize, String name) {

        PageHelper.startPage(pageNum, pageSize);

        HgCertificationsExample example = new HgCertificationsExample();

        if(!(name == null || name.length() == 0)){
            example.createCriteria().andNameLike("%"+name+"%");
        }

        return certficationMapper.selectByExample(example);
    }

    @Override
    public int delete(Integer id) {
        return certficationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Integer id, HgCertifications certifications) {
        certifications.setCertificationId(id);
        return certficationMapper.updateByPrimaryKeySelective(certifications);
    }
}
