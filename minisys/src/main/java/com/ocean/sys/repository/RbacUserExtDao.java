package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacUserExtInfo;

public interface RbacUserExtDao extends PagingAndSortingRepository<RbacUserExtInfo, Long> {
	
}
