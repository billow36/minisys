package com.ocean.sys.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacUser;

public interface RbacUserDao extends PagingAndSortingRepository<RbacUser, Long> {
	@Query("from RbacUser where loginId=?1")
	RbacUser findByLoginName(String loginId);
}
