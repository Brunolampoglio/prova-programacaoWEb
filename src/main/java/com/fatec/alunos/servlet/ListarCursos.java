/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.servlet;

import com.fatec.alunos.model.Curso;
import com.fatec.alunos.service.CursoService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Muralis
 */
@WebServlet("/visualizarCursos")
public class ListarCursos extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CursoService cursoService = new CursoService();
        List<Curso> listaDeCursos = cursoService.getAllCursos();
        request.setAttribute("cursos", listaDeCursos);
        request.getRequestDispatcher("cadastrarAluno.jsp").forward(request, response);
    }
}
