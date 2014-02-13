package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacTask;

public interface RbacTaskDao extends PagingAndSortingRepository<RbacTask, Long> {

}
