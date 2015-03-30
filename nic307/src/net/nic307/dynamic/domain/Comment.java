/**
 * 
 */
package net.nic307.dynamic.domain;

import net.nic307.user.domain.User;

/**
 * @author Rain
 *  评论类
 */
public class Comment {
	private int commentId;   
	private String commentDate;   //评论时间
	private String commentText;    //评论内容
	private short commentLike;    //赞同
	private short commnetDislike;   //反对
	private User user;
	private Article article;
	
	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public String getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(String commentDate) {
		this.commentDate = commentDate;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Short getCommentLike() {
		return commentLike;
	}

	public void setCommentLike(Short commentLike) {
		this.commentLike = commentLike;
	}

	public Short getCommnetDislike() {
		return commnetDislike;
	}

	public void setCommnetDislike(Short commnetDislike) {
		this.commnetDislike = commnetDislike;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
}
