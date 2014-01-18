package com.ocean.sys.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ocean.sys.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
