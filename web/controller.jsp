<%-- 
    Document   : controller
    Created on : 22 Dec, 2016, 4:05:48 PM
    Author     : mca1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@page session="true" errorPage="error.jsp" isErrorPage="true"%>
        <title>JSP Page</title>
    </head>
    <body>
         <%@ include file="header.jsp" %>
        <% int p,y,r;
        p= Integer.parseInt(request.getParameter("principle"));
          r= Integer.parseInt(request.getParameter("rate"));
          y= Integer.parseInt(request.getParameter("year"));
          session.setAttribute("p",p);
          session.setAttribute("r",r);
          session.setAttribute("y",y);
          
            %>
    <center>
            <a href="simple.jsp">1.SIMPLE INTEREST</a></br></br>
            <a href="compound.jsp">2.COMPOUND INTEREST</a></br></br>
            <a href="index.jsp">3.Exit</a></br></br>
    </center>
             <%@ include file="footer.jsp" %>
          
            
    </body>
</html>
