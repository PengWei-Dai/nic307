package net.nic307.user;

import static org.junit.Assert.*;

import java.util.List;


import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.User;
import net.nic307.util.HibernateSessionFactory;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class userTest {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void testUserSessionSave() {
		
		Session session = HibernateSessionFactory.getSession();

		session.beginTransaction();
		
		User user = new User();
		user.setUserId(123);
		user.setUserName("aaa");
		user.setUserPassword("bbb");
		user.setUserCollage("cc");
		user.setUserEmail("eee");
		user.setUserGrade("ggg");
		user.setUserMajor("mmm");
		user.setUserNumber("nnnn");
		user.setUserQQ("111");
		user.setUserSex("ssss");
		session.save(user);
		session.beginTransaction().commit();

		session.close();
	}
	@Test
	public void testSprinSave(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userdao = (UserDao) ctx.getBean("userDao");
		User user = new User();
		user.setUserId(123);
		user.setUserName("aaa");
		user.setUserPassword("bbb");
		user.setUserCollage("cc");
		user.setUserEmail("eee");
		user.setUserGrade("ggg");
		user.setUserMajor("mmm");
		user.setUserNumber("nnnn");
		user.setUserQQ("111");
		user.setUserSex("ssss");
		userdao.save(user);
	}
	@Test
	public void testuserSave(){

		HibernateTemplate ht = new HibernateTemplate(HibernateSessionFactory.getSessionFactory());
		UserDao ud = new UserDao();
		ud.setHibernateTemplate(ht);
		User user = new User();
		user.setUserId(123);
		user.setUserName("aaa");
		user.setUserPassword("bbb");
		user.setUserCollage("cc");
		user.setUserEmail("eee");
		user.setUserGrade("ggg");
		user.setUserMajor("mmm");
		user.setUserNumber("nnnn");
		user.setUserQQ("111");
		user.setUserSex("ssss");
		System.out.println(user.getUserEmail());
		ud.save(user);
	}
	
	
	@Test
	public void testuserFindById(){

		HibernateTemplate ht = new HibernateTemplate(HibernateSessionFactory.getSessionFactory());
		UserDao ud = new UserDao();
		ud.setHibernateTemplate(ht);
		List<User> users = ud.findById(1);
		User user = users.get(0);
		System.out.println(user.getUserName());
		Session session = HibernateSessionFactory.getSession();
		session.close();
	}
	
	@Test
	public void testuserFindByName(){
		HibernateTemplate ht = new HibernateTemplate(HibernateSessionFactory.getSessionFactory());
		UserDao ud = new UserDao();
		ud.setHibernateTemplate(ht);
		List<User> users = ud.findByName("dpw");
		User user = users.get(0);
		System.out.println(users.size());
		for(int i=0;i<users.size();i++){
			System.out.println(users.get(i).getUserId());
		}
		
	}
}
