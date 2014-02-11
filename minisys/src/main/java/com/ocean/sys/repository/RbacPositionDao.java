package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacPosition;

public interface RbacPositionDao extends PagingAndSortingRepository<RbacPosition, Long> {

}
