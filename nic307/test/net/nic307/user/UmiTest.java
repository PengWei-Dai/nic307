package net.nic307.user;

import static org.junit.Assert.*;
import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.Umi;
import net.nic307.user.domain.User;
import net.nic307.user.server.UserServer;
import net.nic307.util.HibernateSessionFactory;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UmiTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		//��һ�������������󣬺͸�����
		User user = new User();
		user.setUserName("umiT1");
		user.setUserPassword("umit1");		
		Umi umi = new Umi();		
		//�ڶ���:�Ӷ����븸�����໥��������	
		user.setUmi(umi);
		umi.setUser(user);
		session.save(user);
		session.getTransaction().commit();
	}

	@Test
	public void testServerSave(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServer userServer = (UserServer) ctx.getBean("userServer");
		User user = new User();
		user.setUserName("umiT1");
		user.setUserPassword("umit1");
		userServer.registUser(user);
	}
}
