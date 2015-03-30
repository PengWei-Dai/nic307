<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>Nic307</title>
  <!-- Bootstrap -->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="css/index.css">

  </head>
<body>

  <!--导航栏开始-->
  <nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
    <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.jsp">Nic 307</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li class="active">
            <a href="#">
              <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
              &nbsp; 首 页
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li>
            <a href="jsp/fault_report.jsp">
              <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
              &nbsp;申报故障
            </a>
          </li>
          <li>
            <a href="fault/FaultPending">
              <span class="glyphicon glyphicon-wrench" aria-hidden="true"></span>
              &nbsp;故障处理
            </a>
          </li>
          <li>
            <a href="#">
              <span class="glyphicon glyphicon-bullhorn" aria-hidden="true"></span>
              &nbsp;关于我们
            </a>
          </li>
          <li>
            <a href="#">
              <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>
              &nbsp;留言
            </a>
          </li>

          <li id="user_regist">
            <a href="jsp/user_regist.jsp" >
              <span class="glyphicon glyphicon-user" aria-hidden="true" ></span>
              &nbsp;注 册
            </a>
          </li>
        </ul>
      </div>
      <!-- /.navbar-collapse --> </div>
    <!-- /.container-fluid --> </nav>
  <!--导航栏结束-->

  <!--轮番图-->
  <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="image/index1.jpg" alt="carousel 1">
        <div class="carousel-caption">...</div>
      </div>
      <div class="item">
        <img src="image/index2.jpg" alt="carousel 2">
        <div class="carousel-caption">...</div>
      </div>
    </div>

    <!-- Controls -->
    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>   
    
   <!-- 307用户登录表单-->
    <div id="user_login">
    	<form class="form-inline" name="user_login" action="user/UserLogin" method="post">
        <div class="form-group">
          <label class="sr-only" for="userName">UserName</label>
          <input type="text" class="form-control" name="userName" placeholder="UserName"></div>
        <div class="form-group">
          <label class="sr-only" for="userPassword">Password</label>
          <input type="password" class="form-control" name="userPassword" placeholder="Password"></div>
        <div class="checkbox">
          <label>
            <input type="checkbox">Remember me</label>
        </div>
        <button type="submit" class="btn btn-default">Sign in</button>
      </form>
    </div><!-- 307用户登录表单结束-->
  </div><!--轮番图结束-->


  <!--内容开始-->
  <div class="jumbotron">
    <h1>Hello, world!</h1>
    <p>isdasdkkkkkkkkkkkkkk</p>
    <p>
      <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
    </p>
  </div>

    <!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
        dsadsdddddddddddd
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script type="text/javascript" src="js/index.js" charset="gbk"></script>
  <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>
