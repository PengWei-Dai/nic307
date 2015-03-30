<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
  <head>
  <meta http-equiv="charset" content="utf-8" >
    <title></title>
  </head>
  
  <body>
    <!-- 加载编辑器的容器 -->
    <script id="container" name="content" type="text/plain">
        这里写你的初始化内容
    </script>
    <!-- 配置文件 -->
    <script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
    <script type="text/javascript" src="../ueditor/ueditor.parse.js"></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="../ueditor/ueditor.all.js"></script>
	<s:property value="title"/>
	<div id="temp"><s:property value="articleText"/></div>
   	<div id="content">
	</div>

<script type="text/javascript">
	$("#content").append($("#temp").text());
	$("#temp").hide();
</script>
<script type="text/javascript">
    uParse('.content', {
    rootPath: '../'
})</script>

</body>
</html>