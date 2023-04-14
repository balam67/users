<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
       <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

                   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<div class="container">
 <div>
 
 </div>
 <br>
 <div class="panel panel-primary">
  <div class="panel-heading">
   <h3>List of Student Enquries</h3>
  </div>
  <div class="panel-body">
   <table class="table">
    <thead>
     <tr>
      <th width="1%">NAME</th>
      <th width="1%">COURSE</th>
      <th width="1%">NUMBER</th>
      <th width="1%">STATUS</th>
      <th width="1%">ACTION</th>
     </tr>
    </thead>
    <tbody>
     <c:forEach items="${studentEnquriesList}" var="studentEnquries">
     <tr>
       <td>&nbsp;${studentEnquries.studentName}</td>
       <td>${studentEnquries.course}</td>
       <td>${studentEnquries.phoneNumber}</td>
       <td>${studentEnquries.enquiryStatus}</td>
       
       <td><a type="button" class="btn btn-success"
        href="/studentenquiryupdate/${studentEnquries.studentId}">Update</a>
       <a type="button" class="btn btn-warning"
        href="/delete-enqury?student-id=${studentEnquries.studentId}">Delete</a></td>
      </tr>
     </c:forEach>
    </tbody>
   </table>
  </div>
 </div>

</div>
<%-- <%@ include file="common/footer.jspf"%>
 --%>
<br><br>
  <a type="button" class="btn btn-primary btn-md" href="/savestudent">Add Student Enquiry</a>
 
</body>
</html>