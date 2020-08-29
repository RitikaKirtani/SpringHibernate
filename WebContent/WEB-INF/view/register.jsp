<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
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
                        <td>
                            <label>Email<label>
                        </td>
                        <td><form:input path="email" /></td>
                    </tr>
                    <tr>
                        <td>
                            <label>Date of Birth</label>
                        </td>
                        <td><form:input path="dob" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="index.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>
