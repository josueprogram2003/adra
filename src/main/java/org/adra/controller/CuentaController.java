/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.adra.controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.adra.dao.CuentaDao;
import org.adra.daoImpl.CuentaDaoImpl;

/**
 *
 * @author dreyna
 */
public class CuentaController extends HttpServlet {

    private CuentaDao cdao = new CuentaDaoImpl();
    private Gson gson = new Gson();

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
        PrintWriter out = response.getWriter();
        boolean create = true;  
        HttpSession sesion = request.getSession(create);
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        //System.out.println(user+" "+pass);
        HashMap<String, Object> datos = cdao.validar(user, pass);
        if (datos.size() > 0) {
            sesion.setAttribute("idpersona", datos.get("idpersona"));
            sesion.setAttribute("nombres", datos.get("nombres"));
            sesion.setAttribute("idcuenta", datos.get("idcuenta"));
            response.sendRedirect("views/menu_asesor.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }

        /*
		int x = 0;
		int opcion = Integer.parseInt(request.getParameter("opc"));
		switch (opcion) {
		case 1:
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			System.out.println(user+" "+pass);
			if (cdao.validar(user, pass)==1) {	
				//response.sendRedirect("/html/menuAsesor.html");
				request.getRequestDispatcher("html/menuAsesor.html").forward(request, response);
			} else {
				out.println("Incorrecto");
				//request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
			break;
		case 2:
			
			break;
		default:
			System.out.println("No se encontro el valor uno o dos en el opc mandado");
			break;
		}*/
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
