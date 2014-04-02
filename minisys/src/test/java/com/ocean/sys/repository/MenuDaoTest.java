package com.ocean.sys.repository;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;

import com.ocean.sys.entity.RbacMenu;

@ContextConfiguration(locations = { "/applicationContext.xml" })
public class MenuDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private RbacMenuDao dao;

	public void findMenus(){
		Collection<Long> ids = new ArrayList<Long>();
		ids.add(1L);
		ids.add(2L);
		List<RbacMenu> menus =dao.findByIdIn(ids);
		assertEquals(0, menus.size());
	}

	public void findTasksByUserId() throws Exception {
		List<RbacMenu> menus = dao.findById(3L);
		getMenu(menus.get(0));
		getMenu(menus.get(0));
		assertEquals(1, menus.size());
	}
	@Test
	public void addMenu(){
		RbacMenu rm = new RbacMenu();
		rm.setHref("/login");
		rm.setIsShow(true);
		rm.setMenuName("用户登陆");
		rm.setSort(2);
		rm.setParent(dao.findOne(3L));
		dao.save(rm);
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
