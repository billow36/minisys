package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacUserRole;

public interface RbacUserRoleDao extends PagingAndSortingRepository<RbacUserRole, Long> {

}
