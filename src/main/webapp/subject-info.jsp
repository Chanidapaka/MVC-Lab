<%@ page import="sit.int202.simple.entities.Subject" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Subject Detail</title>
</head>
<body>
<%
    Subject subject = (Subject) request.getAttribute("subject");
%>
<h2>Subject Info</h2><hr>

<% if (subject != null) { %>
<label>Subject Code: </label>
<input type="text" disabled value="<%= subject.getId() %>"><br>
<label>Title: </label>
<input type="text" disabled value="<%= subject.getTitle() %>"><br>
<label>Credit: </label>
<input type="text" disabled value="<%= subject.getCredit() %>"><br>
<% } else { %>
<h2>Subject code <%= request.getParameter("subjectId") %> does not exist!</h2>
<% } %>

<hr>
<a href="subject-list">Subject List</a><br>
<a href="./">Home</a>

</body>
</html>
