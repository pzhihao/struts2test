<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/4
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:if test="#request.info != null">
        <s:property value="#request.info"/>
    </s:if>
    <s:else>
        <s:property value="name"></s:property>
    </s:else>
</body>
</html>
