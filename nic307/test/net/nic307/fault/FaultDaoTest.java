package net.nic307.fault;

import static org.junit.Assert.*;

import java.util.List;

import net.nic307.fault.dao.FaultDao;
import net.nic307.fault.domain.Fault;
import net.nic307.user.dao.UserDao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FaultDaoTest {

	@Test
	public void test() {
		
	}
	
	@Test
	public void testFindByState() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		FaultDao faultDao = (FaultDao) ctx.getBean("faultDao");
		List<Fault> faults= faultDao.findFaultByState("PENDED");
		System.out.println(faults.get(0).getFaultId());
	}


}
