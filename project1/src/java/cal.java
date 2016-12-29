/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mca1
 */
public class cal extends HttpServlet {

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
        int fn,sn,res1=0,res2=0,res3=0;
        float res4=0;
        String opr;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            fn=Integer.parseInt(request.getParameter("fn"));
            sn=Integer.parseInt(request.getParameter("sn"));
            opr=request.getParameter("op");
           
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cal</title>");            
            out.println("</head>");
            out.println("<body><center>");
              if(opr.equals("+"))
            {
                res1=fn+sn;
                out.println("<h1 style=color:red>ADDITION OF "+fn+" AND "+sn+" is:"+res1+"</h1>");
                 out.println("<a href=\"index.html\"><input type=\"submit\" value=\"Back\"></a>");
            }
            else if(opr.equals("-"))
            {
                res2=fn-sn;
                  out.println("<h1 style=color:red>SUBTRACTION OF "+fn+" AND "+sn+" is:"+res2+"</h1>");
                   out.println("<a href=\"index.html\"><input type=\"submit\" value=\"Back\"></a>");
            }
             else if(opr.equals("*"))
            {
                res3=fn*sn;
                 out.println("<h1 style=color:red>MULTIPLICATION OF "+fn+" AND "+sn+" is:"+res3+"</h1>");
                  out.println("<a href=\"index.html\"><input type=\"submit\" value=\"Back\"></a>");
            }
             else if(opr.equals("/"))
            {
                if(sn==0)
                {
                   out.println("<h1 style=color:red>DIVISION BY ZERO"+"</H1>");
                    out.println("<a href=\"index.html\"><input type=\"submit\" value=\"Back\"></a>");
                }
                else
                {
                res4=fn/sn;
                out.println("<h1 style=color:red>DIVISION OF "+fn+" AND "+sn+" is:"+res4+"</h1>");
                 out.println("<a href=\"calculator.html\"><input type=\"submit\" value=\"Back\"></a>");
                 }
               
            out.println("</center></body>");
            out.println("</html>");
        }
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
    
