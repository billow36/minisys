package com.ocean.sys.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacMenu;


public interface RbacMenuDao extends PagingAndSortingRepository<RbacMenu, Long> {
	List<RbacMenu> findById(Long id);
	List<RbacMenu> findByIdIn(Collection<Long> ids);
}
