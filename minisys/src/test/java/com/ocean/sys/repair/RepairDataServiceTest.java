package com.ocean.sys.repair;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springside.modules.test.spring.SpringTransactionalTestCase;
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class RepairDataServiceTest extends SpringTransactionalTestCase{

	@Autowired
	private RepairDataService repairService;
	@Test
	public void testDeleteAll() {
		repairService.DeleteAll();
	}

}
