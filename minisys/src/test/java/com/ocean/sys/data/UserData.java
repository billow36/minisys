package com.ocean.sys.data;

import org.springside.modules.test.data.RandomData;

import com.ocean.sys.entity.RbacUser;

public class UserData {

	public static RbacUser randomNewUser() {
		RbacUser user = new RbacUser();
		user.setLoginId(RandomData.randomName("user"));
		user.setName(RandomData.randomName("User"));
		user.setPassword(RandomData.randomName("password"));

		return user;
	}
}
