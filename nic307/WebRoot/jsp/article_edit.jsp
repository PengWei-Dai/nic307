<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>NIC307MAIN</title>
    <!-- UEditor文件 -->
	<script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
 	 <script type="text/javascript" src="../ueditor/ueditor.all.js"></script>
    <!-- Bootstrap -->
    <link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    </head>
    <body>

  <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <!-- The mobile navbar-toggle button can be safely removed since you do not need it in a non-responsive implementation -->
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <!-- Note that the .navbar-collapse and .collapse classes have been removed from the #navbar -->
        <div id="navbar">

          <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search">     
            </div>&nbsp;
           <a href="#"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></a>
          </form>

          <ul class="nav navbar-nav">
            <li class="active"><a href="#"><span class="glyphicon glyphicon-list" aria-hidden="true"></span>&nbsp;&nbsp;动态</a></li>
            <li><a href="#about"><span class="glyphicon glyphicon-paperclip" aria-hidden="true"></span>&nbsp;&nbsp;资源</a></li>
            <li><a href="#about"><span class="glyphicon glyphicon-bullhorn" aria-hidden="true"></span>&nbsp;&nbsp;通知</a></li>

          </ul>

          <ul class="nav navbar-nav navbar-right"> 
            <li><a href="#"><span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;&nbsp;发起</a></li>
           <li class="dropdown">
           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><img class="user-head" src="image/user-default.png"><s:property value="#session.userName"/><span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;我的主页</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-cog" aria-hidden="true"></span>&nbsp;&nbsp;设置</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-off" aria-hidden="true"></span>&nbsp;&nbsp;退出</a></li>
              </ul>
            </li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container-fluid" id="main-container"><!--首页内容开始-->
      <div class="row">
        <div class="col-md-9" >
            <div class="context-title">
             <span class="glyphicon glyphicon-tasks" aria-hidden="true"></span>&nbsp;&nbsp;最新动态
             <div class="context-title-foot">
                <ul>
                    <li><a href="#">最新</a></li>
                    <li><a href="#">热门</a></li>
                    <li><a href="#">等待回复</a></li>   
                </ul>     
             </div>
             <hr/>
            </div>
            <div class="context-body">
                <div class="article">
   <form id="article-edit" action="../article/ArticleAdd" method="post">
  <div class="form-group" >
    <label for="articleTitle" class="text-info"><h4><strong>文章标题</strong></h4></label>
    <input type="text" class="form-control" name="articleClass" placeholder="Enter article">
  </div>
  <div class="form-group">
    <label for="articleText"><h4><strong>文章内容</strong></h4></label>
     <!--编辑器初始化内容  -->
     <script type="text/plain" id="EditContainer" name="articleText" style="width:720px;height:240px;">
       <p>这里是提示</p>
     </script>
      <br>
      <!--实例化编辑器-->
      <script type="text/javascript">
        var ue=UE.getEditor('EditContainer');
      </script>

  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
</form>

                </div>

                
            </div>

            <div class="context-foot">
              

            </div>
        </div><!-- /首页内容 -->


        <div class="col-md-3 " id="main-container-right">
            <hr>
            <div class="list-group">
                <a href="#" class="list-group-item"><span class="glyphicon glyphicon-fire" aria-hidden="true"></span>&nbsp;&nbsp;热门文章</a>
                <a href="#" class="list-group-item"><span class="glyphicon glyphicon-th-large" aria-hidden="true"></span>&nbsp;&nbsp;话题广场</a>
                <a href="#" class="list-group-item"><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;活跃用户</a>
            </div>
        </div>
      </div>
    </div> 



  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  </body>
</html>