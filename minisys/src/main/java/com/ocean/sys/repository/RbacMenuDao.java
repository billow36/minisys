package com.ocean.sys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacMenu;


public interface RbacMenuDao extends PagingAndSortingRepository<RbacMenu, Long> {
	@Query()
	List<RbacMenu> findByUserId(String userid);
}
