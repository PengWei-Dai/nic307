package net.nic307.dynamic.action;

import java.util.Map;

import net.nic307.dynamic.domain.Article;
import net.nic307.dynamic.server.ArticleServer;
import net.nic307.user.domain.User;
import net.nic307.user.server.UserServer;
import net.nic307.util.FormatDateTime;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author Rain
 *	����ģ�������ת��
 */
public class ArticleAction extends ActionSupport{

	private String articleAuthor;   //�������µ�����
	private String articleDate;    //��̬�ķ���ʱ�� 
	private String articleClass;   //���·���
	private String articleText;   //��������

	private ArticleServer articleServer;
	private FormatDateTime datetime;
	private UserServer userServer;
	//���һƪ����
	public String add(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		String userName = (String) session.get("userName");
		
		Article art = new Article();
		art.setArticleAuthor(userName);
		art.setArticleText(articleText);
		User user = userServer.getByName(userName);
		user.getArticles().add(art);
		userServer.updata(user);
		return SUCCESS;
	}
	
	//��ȡһƪ����
	public String load(){
		System.out.println("load!");
		System.out.println(this.getArticleServer());
		String text = this.articleServer.loadArticleById(7).getArticleText();
		this.setArticleText(text);
		System.out.println(text);
		ValueStack stack = ActionContext.getContext().getValueStack();
		
		stack.push(text);
		return SUCCESS;
	}


	public String getArticleAuthor() {
		return articleAuthor;
	}

	public void setArticleAuthor(String articleAuthor) {
		this.articleAuthor = articleAuthor;
	}

	public String getArticleDate() {
		return articleDate;
	}

	public void setArticleDate(String articleDate) {
		this.articleDate = articleDate;
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



	public FormatDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(FormatDateTime datetime) {
		this.datetime = datetime;
	}



	public UserServer getUserServer() {
		return userServer;
	}



	public void setUserServer(UserServer userServer) {
		this.userServer = userServer;
	}

	public ArticleServer getArticleServer() {
		return articleServer;
	}

	public void setArticleServer(ArticleServer articleServer) {
		this.articleServer = articleServer;
	}
	
}
