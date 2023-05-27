/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Ficha;
import modeldao.FichaDao;

/**
 *
 * @author APRENDIZ
 */
@WebServlet(name = "ControladorFicha", urlPatterns = {"/ControladorFicha"})
public class ControladorFicha extends HttpServlet {

    String agregarfi = "view/FormFicha.jsp";
    String listarfi = "view/ListarF.jsp";
    String editarfi = "view/EditarF.jsp";
    Ficha fi = new Ficha();;
    FichaDao fidao = new FichaDao();
    int id;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorFicha</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorFicha at " + request.getContextPath() + "</h1>");
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
       

        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listarfi"))
        {
            acceso=listarfi;
        }else if(action.equalsIgnoreCase("agregarfi"))
        {
          acceso=agregarfi;
        }
        if(action.equalsIgnoreCase("Registrar"))
        {
            int codigofi = Integer.parseInt(request.getParameter("codficha"));
            int cantiapre = Integer.parseInt(request.getParameter("cantiaprendices"));
            int codigopro = Integer.parseInt(request.getParameter("listapro"));
            int codigoapre = Integer.parseInt(request.getParameter("listaapre"));
            fi.setCodFicha(codigofi);
            fi.setCantiaprendices(cantiapre);
            fi.setNombrepro(codigopro);
            fi.setNombreapre(codigoapre);
            fidao.registroficha(fi);
          acceso=listarfi;
        }else if(action.equalsIgnoreCase("eliminar")){
            
            id=Integer.parseInt(request.getParameter("id"));
            fi.setCodFicha(id);
            fidao.eliminarficha(id);
            acceso=listarfi;
        }else if(action.equalsIgnoreCase("editar")){
        
            request.setAttribute("id",request.getParameter("id"));
        acceso = editarfi;
        }else if(action.equalsIgnoreCase("Actualizar")){
            int codigoficha = Integer.parseInt(request.getParameter("codficha"));
            int cantapre = Integer.parseInt(request.getParameter("cantiaprendices"));
            int codigoprograma = Integer.parseInt(request.getParameter("nombrepro"));
            int cantapren = Integer.parseInt(request.getParameter("nombreapre"));
            
        }
             RequestDispatcher view=request.getRequestDispatcher(acceso);
        view.forward(request, response);
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
