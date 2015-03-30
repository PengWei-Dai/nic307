
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>测试页面</title>
  </head>
  
  <body>

    获取待处理故障列表：<br>

  <!-- faults在action 中被保存到了request中，所以需要用#来获取 -->
<s:iterator value="faults">
  	 故障负责人：<s:property value="faultMaster"/><br>
  	故障联系电话：<s:property value="faultNumber"/><br>
  	故障应处理时间:<s:property value="faultHandleTime"/><br>
</s:iterator>

  </body>
</html>