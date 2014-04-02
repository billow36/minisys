package com.ocean.sys.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacAction;


public interface RbacActionDao extends PagingAndSortingRepository<RbacAction, Long> {
	List<RbacAction> findById(Long id);
	List<RbacAction> findByIdIn(Collection<Long> ids);
}
