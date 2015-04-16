
package net.nic307.user.domain;

import java.util.HashSet;
import java.util.Set;

import net.nic307.dynamic.domain.Article;
import net.nic307.dynamic.domain.Comment;

/**
 * @author Rain
 * 	�û�������Ϣ����umi����һ��һ�Ĺ���
 */
public class User {
	private int userId;
	private String userName;    
	private String userPassword;   //�û�����
	private String userGrade;   //�û��꼶
	private String userCollage;  //�û�Ժϵ
	private String userMajor;   //�û�רҵ
	private String userNumber;   //�û���ϵ�绰
	private String userQq;     //�û�QQ
	private String userEmail;   //�û�����
	private String userSex;   //�Ա�
	
	private Umi umi;    //�û���չ��Ϣ
	private Set<Article> articles = new HashSet<Article>();  //�û�����
	private Set<Comment> comments = new HashSet<Comment>();   //�û�������
	

	public User(){}   //�յĹ��캯��

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getUserMajor() {
		return userMajor;
	}

	public void setUserMajor(String userMajor) {
		this.userMajor = userMajor;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserQq() {
		return userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
	

	public String getUserCollage() {
		return userCollage;
	}

	public void setUserCollage(String userCollage) {
		this.userCollage = userCollage;
	}

	public Umi getUmi() {
		return umi;
	}

	public void setUmi(Umi umi) {
		this.umi = umi;
	}

	public Set<Article> getArticles() {
		return articles;
	}

	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}


}
