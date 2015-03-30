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
  <title>故障申报</title>
  <!-- Bootstrap -->
  <link href="../css/bootstrap.min.css" rel="stylesheet"></head>
  <link rel="stylesheet" type="text/css" href="../css/fault.css">
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
        <a class="navbar-brand" href="../index.jsp">Nic 307</a>
      </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li ><a href="../index.jsp">
          <span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp; 首 页 
          <span class="sr-only">(current)</span></a></li>
        <li class="active"><a href="#"><span class="glyphicon glyphicon-tag" aria-hidden="true"></span>&nbsp;申报故障</a></li>
        <li><a href="../fault/FaultPending"><span class="glyphicon glyphicon-wrench" aria-hidden="true"></span>&nbsp;故障处理</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-bullhorn" aria-hidden="true"></span>&nbsp;关于我们</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span>&nbsp;留言</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav><!--导航栏结束-->

<!--故障申报表单-->
  <div class="fault">
    <form class="form-horizontal" action="../fault/FaultApply" method="post" name="applyFault">
      <div class="form-group">
        <label for="faultMaster" class="col-sm-2 control-label">姓 名：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="faultMaster" placeholder="张三"></div>
      </div>
      <div class="form-group">
        <label for="faultNumber" class="col-sm-2 control-label">电 话：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="faultNumber" placeholder="624000"></div>
      </div>
      <div class="form-group">
        <label for="faultAddress" class="col-sm-2 control-label">地 址：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="faultAddress" placeholder="第二实验楼二期8888号房间"></div>
      </div>
	 <div class="form-group">
        <label for="faultCollege" class="col-sm-2 control-label">学 院：</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="faultCollege" placeholder="计算机学院"></div>
      </div>
      <div class="form-group">
        <label for="faultHandleTime" class="col-sm-2 control-label">希望处理时间：</label>
        <label class="checkbox-inline">
          <input type="radio" name="faultHandleTime" id="optionsRadios1" 
         value="now" checked>现 在</label>
        <label class="checkbox-inline">
          <input type="radio" name="faultHandleTime" id="optionsRadios2" 
         value="todayAfter">今天下午</label>
          <label class="checkbox-inline">
          <input type="radio" name="faultHandleTime" id="optionsRadios3" 
         value="tomorrowMorning">明天早上</label>
      </div>

      <div class="form-group">
        <label for="faultDesc" class="col-sm-2 control-label">故障描述：</label>
        <div class="col-sm-10">
           <textarea class="form-control" rows="3" name="faultDesc" placeholder="新开网络等等"></textarea></div>
      </div>

      <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-default">提 交</button>
        </div>
      </div>
    </form>
  </div><!--故障申报表单结束-->

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>