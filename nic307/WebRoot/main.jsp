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
    <!-- Bootstrap -->
    <link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="css/main.css">
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
           <li class="dropdown">
           <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
           <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>&nbsp;&nbsp;发起</a>
              <ul class="dropdown-menu" role="menu">
                 <li><a href="#"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span>&nbsp;&nbsp;讨论</a></li>
                <li><a href="jsp/article_edit.jsp"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>&nbsp;&nbsp;文章</a></li>
              </ul>
            </li>
             
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
                <div class="context-list">
                  <img class="context-body-img" src="image/user-default.png">
                  <div class="list-head">
                      <a href="#">今天没吃饱怎么办？</a>
                  </div>
                  <br/>
                  <div class="list-foot">
                      <ul>
                          <li>username+发起了问题</li>
                          <li>22个回复</li>
                          <li>1人关注</li>
                          <li>1分钟前</li>
                      </ul>
                  </div>
                  <hr class="list-hr-talk">
                </div>


                <div class="context-list">
                  <img class="context-body-img" src="image/user-default.png">
                  <div class="list-head">
                      <a href="#">这是一个话题</a>
                  </div>
                  <br/>
                  <div class="list-foot">
                      <ul>
                          <li>username+发起了问题</li>
                          <li>22个回复</li>
                          <li>1人关注</li>
                          <li>1分钟前</li>
                      </ul>
                  </div>
                  <hr class="list-hr-talk">
                </div>


                <div class="context-list">
                  <img class="context-body-img" src="image/user-default.png">
                  <div class="list-head">
                      <a href="#">这是一篇文章</a>
                  </div>
                  <br/>
                  <div class="list-foot">
                      <ul>
                          <li>username+发表了文章</li>
                          <li>22个评论</li>
                          <li>1分钟前</li>
                      </ul>
                  </div>
                  <br>
                  <div class="list-context">
                    4月份开始，在深入研究微信开发了。
                       在了解了更多信息之后，发现微信这玩意，非常简单，也非常复杂。
                       简单，官方就提供了几十个接口，实现起来很简单嘛。网上有几套Java版的实现，PHP的就更多了。
                  </div>
                  <div class="list-more">
                  <a href="#" >查看更多</a>
                  </div>
                  <hr class="list-hr">
                </div>

                    <div class="context-list">
                  <img class="context-body-img" src="image/user-default.png">
                  <div class="list-head">
                      <a href="#">今天没吃饱怎么办？</a>
                  </div>
                  <br/>
                  <div class="list-foot">
                      <ul>
                          <li>username+发起了问题</li>
                          <li>22个回复</li>
                          <li>1人关注</li>
                          <li>1分钟前</li>
                      </ul>
                  </div>
                  <hr class="list-hr-talk">
                </div>

 <div class="context-list">
                  <img class="context-body-img" src="image/user-default.png">
                  <div class="list-head">
                      <a href="#">这是一篇文章</a>
                  </div>
                  <br/>
                  <div class="list-foot">
                      <ul>
                          <li>username+发表了文章</li>
                          <li>22个评论</li>
                          <li>1分钟前</li>
                      </ul>
                  </div>
                  <br>
                  <div class="list-context">
                    4月份开始，在深入研究微信开发了。
                       在了解了更多信息之后，发现微信这玩意，非常简单，也非常复杂。
                       简单，官方就提供了几十个接口，实现起来很简单嘛。网上有几套Java版的实现，PHP的就更多了。
                  </div>
                  <div class="list-more">
                  <a href="#" >查看更多</a>
                  </div>
                  <hr class="list-hr">
                </div>

                 <div class="context-list">
                  <img class="context-body-img" src="image/user-default.png">
                  <div class="list-head">
                      <a href="#">这是一篇文章</a>
                  </div>
                  <br/>
                  <div class="list-foot">
                      <ul>
                          <li>username+发表了文章</li>
                          <li>22个评论</li>
                          <li>1分钟前</li>
                      </ul>
                  </div>
                  <br>
                  <div class="list-context">
                    4月份开始，在深入研究微信开发了。
                       在了解了更多信息之后，发现微信这玩意，非常简单，也非常复杂。
                       简单，官方就提供了几十个接口，实现起来很简单嘛。网上有几套Java版的实现，PHP的就更多了。
                  </div>
                  <div class="list-more">
                  <a href="#" >查看更多</a>
                  </div>
                  <hr class="list-hr">
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