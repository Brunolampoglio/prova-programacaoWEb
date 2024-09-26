/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.servlet;

import com.fatec.alunos.service.AlunoService;
import com.fatec.alunos.model.Aluno;
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
@WebServlet("/buscarAluno")
public class BuscarAluno extends HttpServlet {

    private final AlunoService alunoService = new AlunoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String alunoId = request.getParameter("id");
        Aluno aluno = alunoService.buscarAlunoPorId(alunoId);

        if (aluno != null) {
            request.setAttribute("aluno", aluno);
            CursoService cursoService = new CursoService();
            List<Curso> listaDeCursos = cursoService.getAllCursos();
            request.setAttribute("cursos", listaDeCursos);
            RequestDispatcher dispatcher = request.getRequestDispatcher("editarAluno.jsp"); // A página JSP para editar o aluno
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("visualizarAlunos"); // Redireciona se o aluno não for encontrado
        }
    }
}
