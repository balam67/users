
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

                   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>  
<html>  
<head>  
    <title>{username} Student Enquiry Form </title>  
</head>  
<h3>{username}  Student Enquiry Form</h3>  
<body>  
    <form:form action="${contextPath}/studentenquiry" modelAttribute="studentEnquiryForm" method="POST">  
       Student name: <form:input path="studentName" />         
        <br><br>  
        Phone Number: <form:input path="phoneNumber" />  
        <br><br>  
        
        Class Mode: <form:select path="classMode">  
        <form:option value="online" label="online"/>  
        <form:option value="classroom" label="classroom"/>  
        </form:select>  
        <br><br>  
       Course: <form:select path="course">  
        <form:option value="javafullstack" label="javafullstack"/>  
        <form:option value="devops" label="devops"/>  
        <form:option value="aws" label="aws"/>   
        </form:select>  
        <br><br>  
        
         Enquiry Status: <form:select path="enquiryStatus">  
        <form:option value="new" label="new"/>  
        <form:option value="enrolled" label="enrolled"/>  
        <form:option value="lost" label="lost"/>   
        </form:select>  
        <br><br>  
        <input type="submit" value="Submit" />  
    </form:form>  
    
    <a href="enqurieslist">List Of Student Enquries</a>
</body>  
</html>  