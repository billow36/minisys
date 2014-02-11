package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacUserGroup;

public interface RbacUserGroupDao extends PagingAndSortingRepository<RbacUserGroup, Long> {

}
