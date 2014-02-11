package com.ocean.sys.repository;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class PMADaoTest extends SpringTransactionalTestCase {

	@Autowired
	private RbacPMADao dao;

	@Test
	public void findMenus() throws Exception {
		Collection<Long> ids= new ArrayList<Long>();
		ids.add(1L);
		ids.add(2L);
		List<Long> actionids =dao.findActionIdByPrivilegeId(ids);
		assertEquals(4,actionids.size());
		
		List<Long> menuids =dao.findMenuIdByPrivilegeId(ids);
		assertEquals(2,menuids.size());
		
	}

}
