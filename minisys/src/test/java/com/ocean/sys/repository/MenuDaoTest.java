package com.ocean.sys.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import com.ocean.sys.entity.RbacMenu;
import com.ocean.sys.entity.RbacTask;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class MenuDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private RbacMenuDao dao;

	@Test
	public void findTasksByUserId() throws Exception {
		List<RbacMenu> menus = dao.findById(5L);
		assertEquals(1, menus.size());
	}
}
