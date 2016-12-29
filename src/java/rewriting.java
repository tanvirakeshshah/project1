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
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author mca1
 */
public class rewriting extends HttpServlet {
    private static final long serialVersionUID=1L;
   public rewriting()
   {
       
   }

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet rewriting</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet rewriting at " + request.getContextPath() + "</h1>");
            out.println("</body>");
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
        response.setContentType("text/html");
      //  processRequest(request, response);
        PrintWriter out=response.getWriter();
        String username=request.getParameter("un").trim();
        String password=request.getParameter("pw").trim();
        if(username==null||username.equals("")||password==null||password.equals(""))
        {
            out.println("please enter both username and"+"password<br/><br/>");
            RequestDispatcher requestDispathcher=request.getRequestDispatcher("/login.html");
            requestDispathcher.include(request,response);
        }
        else if(username.equals("mca")&&password.equals("1234"))
        {
            out.println("logged in successfully<br/>");
            out.println("click on the below link to see"+"the values of username and password<br/>");
            out.println("<a href='loginparameter?username="+username+"&password="+password+"'>click here</a>");
        }
        else
        {
            out.println("wrong username and password<br/<<br/>");
            RequestDispatcher requestdispatcher=request.getRequestDispatcher("/login.html");
           requestdispatcher.include(request, response);
        }
        
        
        
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
