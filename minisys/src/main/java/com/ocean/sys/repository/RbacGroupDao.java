package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacGroup;

public interface RbacGroupDao extends PagingAndSortingRepository<RbacGroup, Long> {

}
