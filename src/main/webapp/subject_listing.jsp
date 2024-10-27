<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page import="sit.int202.simple.entities.Subject" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="margin-left: 150px">

//scripting Java//
<%-- <%--%>
<%--     List<Subject> subjectList= (List<Subject>) request.getAttribute("subjects");--%>
<%-- %>--%>


<%-- Create JSP--%>
<table>
    <tr>
        <th>Subject Code</th>
        <th>Title</th>
        <th>Credit</th>
    </tr>
    <c:forEach items="${subjects}" var="subject">
<%--    <% for(Subject subject : subjectList) {%>--%>
    <tr>
        <td><a href="find-Subject?subjectId=${subject.id}">${subject.id}</a></td>
        <td>${subject.title}</td>
        <td>${subject.credit}</td>
    </tr>
    </c:forEach>
<%--    <%}%>--%>
</table>
</body>
</html>
