/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.servlet;

import com.fatec.alunos.service.AlunoService;
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
@WebServlet("/deletarAluno")
public class DeletarAluno extends HttpServlet {
    private final AlunoService alunoService = new AlunoService();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     // Obtém o ID do aluno a ser deletado (como String)
        String idParam = request.getParameter("alunoId");
        
        if (idParam != null && !idParam.isEmpty()) {
            // Chama o método para deletar o aluno
            boolean alunoDeletado = alunoService.deletarAluno(idParam);
            
            if (alunoDeletado) {
                response.setStatus(HttpServletResponse.SC_OK);
                response.sendRedirect("visualizarAlunos");// Resposta 200 OK
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                response.sendRedirect("visualizarAlunos");
                
            }
        } else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST); // Resposta 400 se o ID não for fornecido
            response.sendRedirect("visualizarAlunos");
            
        }
    }
}
