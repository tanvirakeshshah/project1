<%-- 
    Document   : compound
    Created on : 22 Dec, 2016, 4:06:29 PM
    Author     : mca1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <%@page session="true" isErrorPage="true"%>
        <title>JSP Page</title>
    </head>
    <body>
          <%@ include file="header.jsp" %>
        <% int p,r,y;
        p= (Integer)(session.getAttribute("p"));
        r= (Integer)(session.getAttribute("r"));
        y= (Integer)(session.getAttribute("y"));
        double CI=p*(1+(r/100));
        %>
    <center> <h1>The Compound interest is:<%=CI%></h1></center>
        <%@ include file="footer.jsp" %>
    </body>
</html>
