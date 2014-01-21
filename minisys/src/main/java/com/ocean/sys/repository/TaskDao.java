package com.ocean.sys.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.ocean.sys.entity.RbacTask;

public interface TaskDao extends PagingAndSortingRepository<RbacTask, Long>, JpaSpecificationExecutor<RbacTask> {

	Page<RbacTask> findByUserId(Long id, Pageable pageRequest);

	@Modifying
	@Query("delete from RbacTask task where task.user.id=?1")
	void deleteByUserId(Long id);
}
