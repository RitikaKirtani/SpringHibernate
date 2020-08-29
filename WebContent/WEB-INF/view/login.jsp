<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>n</title>
</head>
<body>
<form:form id="loginForm" modelAttribute="login" action="loginProcess" method="POST">
                <table align="center">
                     <tr>
                        <td>
                            <label>User Name</label>
                        </td>
                        <td><form:input path="userName" /></td>
                    </tr>
                    <tr>
                        <td>
                            <label>Password</label>
                        </td>
                        <td><form:input path="password" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td align="left">
                            <form:button id="login" name="login">Login</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="${pageContext.request.contextPath}/index.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>

</body>
</html>