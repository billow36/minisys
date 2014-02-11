package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacRole;

public interface RbacRoleDao extends PagingAndSortingRepository<RbacRole, Long> {
	
}
