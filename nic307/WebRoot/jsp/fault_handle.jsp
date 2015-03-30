<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<jsp:useBean id="fault" class="net.nic307.fault.domain.Fault"/>
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
  <title>故障处理</title>
  <!-- Bootstrap -->
  <link href="../css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="../css/fault_handle.css"></head>
<body>

  <!--故障清单开始-->
  <div id="fault_handle">
    <!--故障页头部-->
    <!--导航栏开始-->
    <nav class="navbar navbar-default navbar-fixed-top ">
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
            <li >
              <a href="../index.jsp">
                <span class="glyphicon glyphicon-home" aria-hidden="true"></span>
                &nbsp; 首 页
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li >
              <a href="../jsp/fault_report.jsp">
                <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                &nbsp;申报故障
              </a>
            </li>
            <li class="active">
              <a href="FaultPending">
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
          </ul>
        </div>
        <!-- /.navbar-collapse --> </div>
      <!-- /.container-fluid --> </nav>
    </div><!--导航栏结束-->

    <div class="container-fluid" id="fault_content">
            <div class="row">
              <div class="col-md-6" id="fault_lists" >
              <a href="../fault/FaultPending" class="btn btn-warning btn-lg active" role="button">待处理故障 </a>
              <a href="../fault/FaultPended" class="btn btn-success btn-lg" role="button">已处理故障 </a>
              <a href="../fault/FaultPend" class="btn btn-info btn-lg" role="button">&nbsp;&nbsp;所有故障&nbsp;&nbsp; </a>
              <a href="#" class="btn btn-info btn-lg" role="button">&nbsp;&nbsp;历史统计&nbsp;&nbsp;</a>
             </div>

              <div class="col-md-6" id="fault_content_pending">
                    <table class="table table-striped">
                    <caption><span id="table-title">故障列表</span></caption>
                      <thead>
                        <tr>
                          <th>故障编号</th>
                          <th>负责人</th>
                          <th>联系地址</th>
                          <th>联系电话</th>
                          <th>所属学院</th>
                          <th>希望处理时间</th>
                          <th>故障描述</th>
                        </tr>
                      </thead>
                      <tbody>
  					  <s:iterator value="faults">
                        <tr>
                          <td><s:property value="faultId"/></td>
                          <td><s:property value="faultMaster"/></td>
                          <td><s:property value="faultAddress"/></td>
                          <td><s:property value="faultNumber"/></td>
                          <td><s:property value="faultCollege"/></td>
                          <td><s:property value="faultHandleTime"/></td>
                          <td><s:property value="faultDesc"/></td>
                          <th><a class="btn btn-default" href="#" role="button">我要处理</a></th>
                        </tr>
                        </s:iterator>
                      </tbody>
                    </table>
               </div>
              </div>
              </div>
        <div>
      	
        	<c:out value=""></c:out>
        
        </div>      
              
        <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
        <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
        <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
       <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
  </body>
</html>