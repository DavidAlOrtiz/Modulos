<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios</h1>
        <ul>
         <c:forEach items="${usuario}" var="u"> 
             <li> ${u.username}</li>
         </c:forEach>
      </ul>
    </body>
</html>
