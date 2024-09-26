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

/**
 *
 * @author Muralis
 */
@WebServlet("/editarAluno")
public class editarAluno extends HttpServlet {
    private final AlunoService alunoService = new AlunoService();
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String anoIngresso = request.getParameter("anoIngresso");
        String curso = request.getParameter("curso");
        Aluno aluno = new Aluno(id, nome, email, anoIngresso, curso);
        alunoService.editarAluno(id, aluno); // Método para editar aluno no serviço
        response.sendRedirect("visualizarAlunos");
    }
    
}
