package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacUser;

public interface RbacUserDao extends PagingAndSortingRepository<RbacUser, Long> {
	RbacUser findByloginId(String loginId);
}
