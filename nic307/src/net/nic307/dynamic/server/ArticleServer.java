/**
 * 
 */
package net.nic307.dynamic.server;

import java.util.List;

import net.nic307.dynamic.dao.ArticleDao;
import net.nic307.dynamic.domain.Article;

/**
 * @author Rain
 *
 */
public class ArticleServer {
	private ArticleDao articleDao;

	public void addArticle(Article art){
		System.out.println("in Server!");
		this.getArticleDao().save(art);
	}
	public Article loadArticle(String article){
		return articleDao.loadArticleByAuthor("dpw");
	}
	
	public Article loadArticleById(int id){
		System.out.println("server!");
		List<Article> arts = articleDao.loadArticleById(id);
		System.out.println(arts.size());
		return arts.get(0);
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
}
