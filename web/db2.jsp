<%-- 
    Document   : db1
    Created on : 23 Dec, 2016, 11:48:27 AM
    Author     : mca1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*,java.util.*,java.sql.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

           
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var="emp" driver="oracle.jdbc.driver.OracleDriver" 
                           url="jdbc:oracle:thin:@172.16.20.20:1521:orcl" 
                           user="c##mca41" password="mca41"/>
        <sql:query dataSource="${emp}" var="result">
            SELECT * from emp
        </sql:query>
    <center><h1>Select statement</h1>
        <h3><u>Employee table</u></h3></center>
    <table align="center" border="1" width="50%">
        <tr bgcolor="#949494">
            <th>Emp ID</th>
            <th>FName</th>
             <th>LName</th>
               <th>DOB</th>
               <th>gender</th>
               <th>hire date</th>
            <th> Basic pay</th>
            <th>Dept_id</th>
            <th></th>
        </tr>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td><c:out value="${row.empno}"/></td>
                 <td><c:out value="${row.fname}"/></td>
                 <td><c:out value="${row.lname}"/></td>
                 <td> <fmt:formatDate value="${row.dob}" type="date"/></td>
                 <td><c:out value="${row.gender}"/></td>
                
                   <td> <fmt:formatDate value= "${row.hiredate}" type="date"/></td>
                 <td><c:out value="${row.basicsalary}"/></td>
                 <td><c:out value="${row.dept_id}"/></td>
                
                
            </tr>
        </c:forEach>
    </table>
     </body>
</html>
