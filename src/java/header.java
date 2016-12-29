/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mca1
 */
public class header extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body><center>");
            out.println("<h1>Request Method:  "+ request.getMethod()+"</h1>");
            out.println("<h1>Request URI:  "+request.getRequestURI()+"</h1>");
            out.println("<h1>Request protocol:  "+request.getProtocol()+"</h1>");
           
           out.println ("<table border=1>"+"<tr><th><h1>HEADER NAME</h1>"+"</th>"+"<th>"+"<h1>HEADER VALUE</h1>"+"</th></tr>");
           Enumeration h=request.getHeaderNames();
           while(h.hasMoreElements())
           {
               String h1=(String)h.nextElement();
               out.println("<tr><td>"+"<h1>"+h1+"</h1></td>");
               out.println("<td><h2>"+request.getHeader(h1)+"</h2></td></tr>");
               
           }
            out.println("</table>");
            out.println("<h1></h1><h1></h1>");
            out.println("<table border=1><tr><th>"+"<h1>VARIABLE NAME</h1></th>"+"<th><h1>VALUE NAME</h1></th></tr>");
            out.println("<tr><td><h2>Content_length</h2></td>"+"<td><h2>"+request.getContentLength()+"</h2></td></tr>");
            out.println("<tr><td><h2>Content_type</h2></td>"+"<td><h2>"+request.getContentType()+"</h2></td></tr>");
            out.println("<tr><td><h2>Document_root</h2></td>"+"<td><h2>"+getServletContext().getRealPath("/")+"</h2></td></tr>");
            out.println("<tr><td><h2>Remote_Address</h2></td>"+"<td><h2>"+request.getRemoteAddr()+"</h2></td></tr>");
            out.println("<tr><td><h2>Remote_host</h2></td>"+"<td><h2>"+request.getRemoteHost()+"</h2></td></tr>");
            out.println("<tr><td><h2>Request_method</h2></td>"+"<td><h2>"+request.getMethod()+"</h2></td></tr>");
            out.println("<tr><td><h2>Script_name</h2></td>"+"<td><h2>"+request.getServletPath()+"</h2></td></tr>");
            out.println("<tr><td><h2>Server_name</h2></td>"+"<td><h2>"+request.getServerName()+"</h2></td></tr>");
            out.println("<tr><td><h2>Server_port</h2></td>"+"<td><h2>"+String.valueOf(request.getServerPort())+"</h2></td></tr>");
            out.println("<tr><td><h2>Server_protocol</h2></td>"+"<td><h2>"+request.getProtocol()+"</h2></td></tr>"); 
            out.println("<tr><td><h2>Server_software</h2></td>"+"<td><h2>"+getServletContext().getServerInfo()+"</h2></td></tr>"); 
            
            out.println("</table>");
            out.println("</center>");
            out.println("<center><h1><a href=header1.html>back</a></h1></center></body>"); 
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
