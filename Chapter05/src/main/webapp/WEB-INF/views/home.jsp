<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Welcome to Spitter</h1>

    <a href="<c:url value="/spittles" />">Spittles</a> |
    <%--<c:url/>起到的是重写url作用，如果用户禁用了cookie的话，当然，这里只是起一个超链接的作用--%>
    <a href="<c:url value="/spitter/register" />">Register</a>
  </body>
</html>
