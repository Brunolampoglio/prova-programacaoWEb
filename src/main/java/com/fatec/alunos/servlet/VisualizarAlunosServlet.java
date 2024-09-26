/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.servlet;

import com.fatec.alunos.service.AlunoService;
import com.fatec.alunos.model.Aluno;
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
@WebServlet("/visualizarAlunos")
public class VisualizarAlunosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AlunoService alunoService = new AlunoService();
        List<Aluno> listaDeAlunos = alunoService.getAllAlunos();
        request.setAttribute("alunos", listaDeAlunos);
        request.getRequestDispatcher("visualizarAlunos.jsp").forward(request, response);
    }
}

