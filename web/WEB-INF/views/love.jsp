<%@ taglib prefix="s" uri="/struts-tags" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/13
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <s:iterator value="#request.list" var="o" status="st">
        <s:if test="#st.odd">
            <s:if test="#st.index == 0">
                <span style="font-size: 32px;color: red"><s:property value="#o.name"></s:property></span><br>
            </s:if>
            <s:else>
                <span style="font-size: 32px;color: aqua"><s:property value="#o.name"></s:property></span><br>
            </s:else>
        </s:if>
        <s:else>
            <span style="font-size: 32px;color: green"><s:property value="#o.name"></s:property></span><br>
        </s:else>
    </s:iterator>
</body>
</html>
