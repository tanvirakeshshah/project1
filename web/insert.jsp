<%-- 
    Document   : insert
    Created on : 27 Dec, 2016, 11:59:11 AM
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
    <form  action="insertdisplay.jsp" method="post">
      
         <center>
         <table border="1">
             <h1>INSERT RECORD</h1>
             <tr> <td> Employee Id</td><td><input type="text" name="empid"></td>
         </tr>
          
         <tr> <td> Employee First Name</td><td><input type="text" name="fname"></td>
        </tr>
        <tr><td>Employee Last Name</td><td><input type="text" name="lname"></td>
        </tr>
        <tr><td> Date Of Birth</td><td><input type="text" name="dob"></td>
        </tr>
        <tr><td> Gender</td><td><input type="text" name="gender"></td>
        </tr>
        <tr><td>Hire Date</td><td><input type="text" name="hiredate"></td>
        </tr>
        <tr><td>Basic salary</td><td><input type="number" name="sal"></td>
        </tr>
        <tr><td>Department Id</td><td><input type="text" name="deptid"></td>
        </tr>  
        </table>
       <center><input type="submit" value="INSERT"></center>
         
         </center>
</form>
         
        
    </body>
</html>
