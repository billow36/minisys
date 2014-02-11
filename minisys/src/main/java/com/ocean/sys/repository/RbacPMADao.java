package com.ocean.sys.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacPMA;


public interface RbacPMADao extends PagingAndSortingRepository<RbacPMA, Long> {
	@Query("select distinct p.actionId from RbacPMA p where p.privilegeId in (?1)")
	List<Long> findActionIdByPrivilegeId(Collection<Long> pid);
	@Query("select distinct p.menuId from RbacPMA p where p.privilegeId in (?1)")
	List<Long> findMenuIdByPrivilegeId(Collection<Long> pid);
}
