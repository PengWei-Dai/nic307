<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <title>用户注册</title>
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/user.css">
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
        <a class="navbar-brand" href="../index.html">Nic 307</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
          <li class="active">
            <a href="../index.html">
              <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
              &nbsp; 首 页
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li>
            <a href="fault_report.html">
              <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
              &nbsp;申报故障
            </a>
          </li>
          <li>
            <a href="fault_handle.html">
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

          <li class="active" id="user_regist">
            <a href="#">
              <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
              &nbsp;注 册
            </a>
          </li>
        </ul>
      </div>
      <!-- /.navbar-collapse --> </div>
    <!-- /.container-fluid --> </nav>
  <!--导航栏结束-->
  
    <div id="regist"><!--注册页容开始-->
    <div id="regist_title"><!--注册页面头部开始-->
      
    </div><!--注册页面头部结束-->
    

    <div id="regist_content"><!--注册页面内容开始-->
       <div class="fault">
     <!-- 表单 -->
    <form class="form-horizontal" name="user_regist" action="../user/UserRegist" method="post">
      <div class="form-group">
        <label for="userName" class="col-sm-2 control-label">姓 名：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control"  name="userName" placeholder="张三"></div>
      </div>
      <div class="form-group">
        <label for="userPassword" class="col-sm-2 control-label">密 码：</label>
        <div class="col-sm-10">
          <input type="password" class="form-control" name="userPassword" placeholder=""></div>
      </div>
      
      <div class="form-group">
        <label for="userNumber" class="col-sm-2 control-label">电 话：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="userNumber" placeholder="624000"></div>
      </div>
 <!-- 
      <div class="form-group">
        <label for="inputClass" class="col-sm-2 control-label">年 级：</label>
        <!-- Single button 
        <div class="btn-group">
          <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
            2012级<span class="caret"></span>
          </button>
          <ul class="dropdown-menu" role="menu">
            <li><a href="#">2013级</a></li>
            <li><a href="#">2014级</a></li>
            <li><a href="#">2015级</a></li>
            <li><a href="#">2016级</a></li>
            <li><a href="#">2017级</a></li>
          </ul>
        </div>
     </div>
   -->
     <div class="form-group">
        <label for="userCollage" class="col-sm-2 control-label">院 系：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="userCollage" placeholder="计算机学院"></div>
      </div>
  <div class="form-group">
        <label for="userMajor" class="col-sm-2 control-label">专 业：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="userMajor" placeholder="计算机科学与技术"></div>
      </div>
       <div class="form-group">
        <label for="userEmail" class="col-sm-2 control-label">Email：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="userEmail" placeholder="1039895299@qq.com"></div>
      </div>

      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default">提 交</button>
        </div>
      </div>

       <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="button" class="btn btn-danger">取 消</button>
        </div>
      </div>
    </form>
  </div>
    </div><!--注册页面内容结束-->
    
  </div><!--注册页面内容结束-->


  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  </body>
</html>