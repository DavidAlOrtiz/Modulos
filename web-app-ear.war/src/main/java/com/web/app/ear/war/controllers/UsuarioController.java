package com.web.app.ear.war.controllers;

import com.web.app.ear.ejb.services.IUsuarioService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/", "/listar"})
public class UsuarioController extends HttpServlet {
    
    @Inject
    private IUsuarioService usuarioService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("usuario", usuarioService.getUsuarios());
        getServletContext().getRequestDispatcher("/usuario.jsp").forward(req, resp);
    }
    
}
