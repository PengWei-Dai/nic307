/**
 * 
 */
package net.nic307.dynamic.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import net.nic307.user.domain.User;

/**
 * @author Rain
 * ������ �̳��˶�̬��Dynamic
 */
public class Article implements Serializable{

	private static final long serialVersionUID = 1L;
	private int articleId;
	private String articleAuthor;   //�������µ�����
	private short articleCommentCount;    //���µĻظ�����
	private short articleCollectionCount;    //���µ��ղ�����
	private String articleDate;    //��̬�ķ���ʱ�� 
	private short articleLike;    //�ޣ�
	private String articleClass;   //���·���
	private String articleText;   //��������
	private User user;
	private Set<Comment> comments = new HashSet<Comment>();
	
	
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getArticleAuthor() {
		return articleAuthor;
	}
	public void setArticleAuthor(String articleAuthor) {
		this.articleAuthor = articleAuthor;
	}
	public short getArticleCommentCount() {
		return articleCommentCount;
	}
	public void setArticleCommentCount(short articleCommentCount) {
		this.articleCommentCount = articleCommentCount;
	}
	public short getArticleCollectionCount() {
		return articleCollectionCount;
	}
	public void setArticleCollectionCount(short articleCollectionCount) {
		this.articleCollectionCount = articleCollectionCount;
	}
	public String getArticleDate() {
		return articleDate;
	}
	public void setArticleDate(String articleDate) {
		this.articleDate = articleDate;
	}
	public short getArticleLike() {
		return articleLike;
	}
	public void setArticleLike(short articleLike) {
		this.articleLike = articleLike;
	}
	public String getArticleClass() {
		return articleClass;
	}
	public void setArticleClass(String articleClass) {
		this.articleClass = articleClass;
	}
	public String getArticleText() {
		return articleText;
	}
	public void setArticleText(String articleText) {
		this.articleText = articleText;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
//	public Comment getComment() {
//		return comment;
//	}
//	public void setComment(Comment comment) {
//		this.comment = comment;
//	}
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}