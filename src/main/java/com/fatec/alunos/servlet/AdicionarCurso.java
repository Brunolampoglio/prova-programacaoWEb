/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.servlet;

import com.fatec.alunos.model.Curso;
import com.fatec.alunos.service.CursoService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Muralis
 */
@WebServlet("/adicionarCurso")
public class AdicionarCurso extends HttpServlet {
    private final CursoService cursoService = new CursoService();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nomeCurso");
        String id = UUID.randomUUID().toString();
        Curso curso = new Curso(id, nome);
        cursoService.adicionarCurso(curso);
        List<Curso> listaDeCursos = cursoService.getAllCursos();
        request.setAttribute("cursos", listaDeCursos);
        request.getRequestDispatcher("cadastrarAluno.jsp").forward(request, response);
    }
    
}
