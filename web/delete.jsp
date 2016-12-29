<%-- 
    Document   : delete
    Created on : 27 Dec, 2016, 11:58:43 AM
    Author     : mca1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*,java.sql.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form method="get" action="updatedisplay.jsp">
        <CENTER><h1>DELETE RECORD</H1></CENTER>
    <center>
        <table border="1">
            <tr><td>Employee Id</td><td><input type="text" name="empid"></td></td>
        
        </table>
        </br>
        <center> <input type="submit" value="DELETE">
    </center>             
         </form>
    </body>
</html>
