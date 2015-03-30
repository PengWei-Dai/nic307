/**
 * 
 */
package net.nic307.dynamic.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import net.nic307.dynamic.domain.Article;
import net.nic307.user.domain.User;

/**
 * @author Rain
 *
 */
public class ArticleDao {
	private HibernateTemplate hibernateTemplate;
	
	public static final String ARTICLETITLE = "articleText";
	public static final String ARTICLAUTHOR = "articleAuthor";
	public static final String ARTICLID="articleId";
	//保存一个article实例
	public void save(Article art){
		System.out.println(art.getArticleAuthor());
		this.getHibernateTemplate().save(art);
	}
	//查询一篇文章
	public Article loadArticleByAuthor(String author){
		List<Article> arts= this.findByProperty(ARTICLAUTHOR, author);
		return arts.get(0);
	}
	public List<Article> loadArticleById(int id){
		System.out.println("dao!");
		return this.findByProperty(ARTICLID, id);
	}
	
	
	//查询Article属性的中任何一个属性
	public List<Article> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from Article as art where art."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {		
			throw re;
		}
	}
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
