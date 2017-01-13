<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/4
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="love">love</a>
  <s:form action="hello" method="POST">
    <s:textfield name="name"></s:textfield>
    <s:submit/>
  </s:form>
  <a href="input.jsp">input</a>
  </body>
</html>
