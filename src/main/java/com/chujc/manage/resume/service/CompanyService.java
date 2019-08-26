package com.chujc.manage.resume.service;

import com.chujc.manage.resume.mbg.model.HgCompanys;

import java.util.List;

public interface CompanyService {

    int create(HgCompanys company);

    int delete(Integer id);

    int update(Integer id, HgCompanys company);

    List<HgCompanys> index(int pageNum, int pageSize, String name);
}
