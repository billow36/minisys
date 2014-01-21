package com.ocean.sys.data;

import com.ocean.sys.entity.RbacUser;
import com.ocean.sys.entity.RbacTask;

import org.springside.modules.test.data.RandomData;

/**
 * Task相关实体测试数据生成.
 * 
 * @author calvin
 */
public class TaskData {

	public static RbacTask randomTask() {
		RbacTask task = new RbacTask();
		task.setTitle(randomTitle());
		RbacUser user = new RbacUser(1L);
		task.setUser(user);
		return task;
	}

	public static String randomTitle() {
		return RandomData.randomName("Task");
	}
}
