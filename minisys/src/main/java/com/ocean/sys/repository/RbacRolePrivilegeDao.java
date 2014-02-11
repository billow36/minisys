package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ocean.sys.entity.RbacRolePrivilege;
import com.ocean.sys.entity.RbacUser;

public interface RbacRolePrivilegeDao extends PagingAndSortingRepository<RbacRolePrivilege, Long> {

}
