package net.nic307.dynamic;

import static org.junit.Assert.*;

import java.util.List;

import net.nic307.dynamic.domain.Article;
import net.nic307.dynamic.domain.Comment;
import net.nic307.dynamic.server.ArticleServer;
import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.Umi;
import net.nic307.user.domain.User;
import net.nic307.user.server.UserServer;
import net.nic307.util.HibernateSessionFactory;

import org.hibernate.Session;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDaynamic {

	@Test
	public void testArticleSave() {
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		User user = new User();
		user.setUserName("article");
		user.setUserPassword("pass");
		Article art1 = new Article();
		art1.setArticleAuthor("dpw");
		art1.setArticleText("this is two article1111111111");
		Article art2 = new Article();
		art2.setArticleAuthor("dpw");
		art2.setArticleText("this is two article22222222222");
		art1.setUser(user);
		art2.setUser(user);
		
		user.getArticles().add(art1);
		user.getArticles().add(art2);
		session.save(user);
		session.getTransaction().commit();
	}
	
	@Test 
	public void testSaveUser(){  
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		//先注册一个用户
		User user = new User();
		user.setUserName("user");
		user.setUserPassword("user");
		
		Umi umi = new Umi();
		umi.setUmiCompany("suse");
		umi.setUser(user);
		user.setUmi(umi);
		session.save(user);
		session.getTransaction().commit();
		
		//注册第二个用户
		Session session3 = HibernateSessionFactory.getSession();
		session3.beginTransaction();
		//先注册一个用户
		User user1 = new User();
		user1.setUserName("lxd");
		user1.setUserPassword("lxd");
		
		Umi umi1 = new Umi();
		umi1.setUmiCompany("suse");
		umi1.setUser(user1);
		user.setUmi(umi1);
		session3.save(user1);
		session3.getTransaction().commit();
		
		
		Session session1 = HibernateSessionFactory.getSession();
		session1.beginTransaction();
		
		//该用户发表一篇文章
		Article article = new Article();
		article.setArticleAuthor("dpw");
		article.setArticleText("hahahahhah");
		article.setUser(user);
		user.getArticles().add(article);
		session1.save(user);
		session1.getTransaction().commit();
		
		Session session2 = HibernateSessionFactory.getSession();
		session2.beginTransaction();
		Article article1 = new Article();
		article1.setArticleAuthor("lxd");
		article1.setArticleText("wawawawawa");
		article1.setUser(user);
		user.getArticles().add(article1);
		session2.save(user);
		session2.getTransaction().commit();

		//lxd评论user的文章
		Session session4 = HibernateSessionFactory.getSession();
		session4.beginTransaction();
		Comment comment = new Comment();
		comment.setCommentText("我好喜欢这篇文章啊aaaaa！！！！");
		comment.setArticle(article1);
		comment.setUser(user1);
		article1.getComments().add(comment);
		user1.getComments().add(comment);
		session.save(user1);
		session.getTransaction().commit();
		
	}
	
	@Test 
	public void testLoadArticle(){  
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleServer articleServer = (ArticleServer) ctx.getBean("articleServer");
		Article art = articleServer.loadArticleById(7);
		System.out.println(art.getArticleText());
	}
//	@Test
//	public void testSaveArticle(){
//		Session session = HibernateSessionFactory.getSession();
//		session.beginTransaction();
//		
//		Article article = new Article();
//		article.setArticleAuthor("dpw");
//		article.setArticleText("hahahahhah");
//		article.setUser(user);
//	}
}
