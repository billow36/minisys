package com.ocean.sys.repository;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
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
		List<RbacMenu> menus = dao.findById(3L);
		getMenu(menus.get(0));
		getMenu(menus.get(0));
		assertEquals(1, menus.size());
	}

	private void getMenu(RbacMenu rm) {
		RbacMenu tp = rm.getParent();
		if (tp != null) {
			System.out.println("父目录：" + rm.getParent().getMenuName());
		}
		else{
			System.out.println("根目录");
		}
		System.out.println("当前目录：" + rm.getMenuName());

		Iterator<RbacMenu> it = rm.getChilds().iterator();

		while (it.hasNext()) {
			getMenu((RbacMenu) it.next());
		}
	}
}
