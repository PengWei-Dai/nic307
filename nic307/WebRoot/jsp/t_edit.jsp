<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE HTML>
<html>
 <head>  
  <title>My JSP 'index.jsp' starting page</title>
  <meta http-equiv="chartset" content="utf-8">
  <script type="text/javascript" src="../ueditor/ueditor.config.js"></script>
  <script type="text/javascript" src="../ueditor/ueditor.all.js"></script>
  </head>
  
  <body>
   <form action="pub" method="post">
     类别：<input type="text" name="category"><br>
     题目：<input type="text" name="title"><br>
     <!--初始化内容  -->
     <script type="text/plain" id="EditContainer" name="content" style="width:1000px;height:240px;">
       <p>这里是提示</p>
     </script>
      <br>
      <!--实例化编辑器-->
      <script type="text/javascript">
        var ue=UE.getEditor('EditContainer');
      </script>
      <input type="submit" value="提交">
   </form>
  </body>
</html>