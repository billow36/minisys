package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacCompany;

public interface RbacCompanyDao extends PagingAndSortingRepository<RbacCompany, Long> {

}
