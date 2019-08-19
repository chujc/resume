package com.chujc.manage.resume.service;

import com.chujc.manage.resume.mbg.model.HgCertifications;

import java.util.List;

public interface CertificationService {

    int create(HgCertifications certifications);

    List<HgCertifications> list(int pageNum, int pageSize, String name);

    int delete(Integer id);

    int update(Integer id, HgCertifications certifications);
}
