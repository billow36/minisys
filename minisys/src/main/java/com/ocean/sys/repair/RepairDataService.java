package com.ocean.sys.repair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ocean.sys.repository.RbacActionDao;
import com.ocean.sys.repository.RbacAreaDao;
import com.ocean.sys.repository.RbacCompanyDao;
import com.ocean.sys.repository.RbacGroupDao;
import com.ocean.sys.repository.RbacGroupRoleDao;
import com.ocean.sys.repository.RbacMenuDao;
import com.ocean.sys.repository.RbacOrgLevelDao;
import com.ocean.sys.repository.RbacPMADao;
import com.ocean.sys.repository.RbacPositionDao;
import com.ocean.sys.repository.RbacPrivilegeDao;
import com.ocean.sys.repository.RbacRoleDao;
import com.ocean.sys.repository.RbacRolePrivilegeDao;
import com.ocean.sys.repository.RbacTaskDao;
import com.ocean.sys.repository.RbacUserDao;
import com.ocean.sys.repository.RbacUserExtDao;
import com.ocean.sys.repository.RbacUserGroupDao;
import com.ocean.sys.repository.RbacUserPositionDao;
import com.ocean.sys.repository.RbacUserRoleDao;

/*
 * 清除数据
 */
//Spring Bean的标识.
/*
 * 清除数据
 */
//Spring Bean的标识.
@Service
// 默认将类中的所有public函数纳入事务管理.

public class RepairDataService {
	@Autowired
	private RbacMenuDao menuDao;
	@Autowired
	private RbacActionDao actionDao;
	@Autowired
	private RbacPMADao pmaDao;
	@Autowired
	private RbacRolePrivilegeDao rolePrivilegeDao;
	@Autowired
	private RbacGroupRoleDao groupRoleDao;
	@Autowired
	private RbacUserRoleDao userRoleDao;

	@Autowired
	private RbacUserGroupDao userGroupDao;
	@Autowired
	private RbacUserPositionDao userPositionDao;

	@Autowired
	private RbacUserDao userDao;

	@Autowired
	private RbacUserExtDao userextDao;
	@Autowired
	private RbacPositionDao positonDao;
	
	@Autowired
	private RbacOrgLevelDao orgLevelDao;
	@Autowired
	private RbacCompanyDao companyDao;
	@Autowired
	private RbacAreaDao areaDao;
	@Autowired
	private RbacRoleDao roleDao;
	@Autowired
	private RbacGroupDao groupDao;
	@Autowired
	private RbacPrivilegeDao privilegeDao;
	@Autowired
	private RbacTaskDao taskDao;
	@Transactional
//	@RequiresPermissions("sys:admin")
	public void DeleteAll() {
		// 解除各种关连数据
		userRoleDao.deleteAll();
		groupRoleDao.deleteAll();
		userGroupDao.deleteAll();
		rolePrivilegeDao.deleteAll();
		userPositionDao.deleteAll();
		taskDao.deleteAll();
		// 删除用户扩展信息
		userextDao.deleteAll();
		// 删除用户信息
		userDao.deleteAll();
		//删除职务信息
		positonDao.deleteAll();
		//删除行政信息
		orgLevelDao.deleteAll();
		//删除公司信息
		companyDao.deleteAll();
		//删除区域信息
		areaDao.deleteAll();
		//删除角色信息
		roleDao.deleteAll();
		//删除组信息
		groupDao.deleteAll();
		//删除权限信息
		privilegeDao.deleteAll();
		// 删除菜单，操作权限，权限的关连
		pmaDao.deleteAll();
		// 删除所有菜单
		menuDao.deleteAll();
		// 删除所有动作
		actionDao.deleteAll();

		
	}
}
