<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   

<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
    <div align="center">
        <h2>User Registration</h2>
        <form:form action="registeruser" method="post" modelAttribute="userRegistrationForm">
            <form:label path="userName">User name:</form:label>
            <form:input path="userName"/><br/>
             
            <form:label path="email">E-mail:</form:label>
            <form:input path="email"/><br/>
             
            <form:label path="password">Password:</form:label>
            <form:password path="password"/><br/>   
            
             <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName"/><br/>
            
             <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName"/><br/>
            
             <form:label path="phoneNumber">Phone No:</form:label>
            <form:input path="phoneNumber"/><br/>   
 
           
           
                 
            <form:button>Register</form:button>
        </form:form>
    </div>
</body>
</html>