<%-- 
    Document   : index
    Created on : 22 Dec, 2016, 4:05:12 PM
    Author     : mca1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@page  isErrorPage="true" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <form action="controller.jsp" method="post">
       
        <center>Enter the principle Amount :<input type="text" name="principle"></br></br></br>
            Enter the Rate of Interest :<input type="text" name="rate"></br></br></br>
            Enter the No. of year:<input type="text" name="year"></br></br></br>
        <input type="submit" value="submit">&emsp;&emsp;&emsp;
        <input type="reset" value="reset"></center>
        </form>
        <%@ include file="footer.jsp" %>
       </body>
</html>
