<%@page import="com.fatec.alunos.model.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lista de Alunos</title>
        <!-- Adicione o link para o arquivo CSS do Bootstrap -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

        <style>
            .floating-button {
                position: fixed;
                bottom: 20px;
                right: 20px;
                z-index: 1000;
                margin-right: 10px;
            }
            .floating-button-back {
                position: fixed;
                bottom: 20px;
                right: 250px;
                z-index: 1000;
                margin-right: 10px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-4 mb-4">Alunos</h1>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th>Ano de Ingresso</th>
                        <th>Curso</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Aluno> alunos = (List<Aluno>) request.getAttribute("alunos");
                        if (alunos != null && !alunos.isEmpty()) {
                            for (Aluno aluno : alunos) {
                    %>
                    <tr>
                        <td><%= aluno.getNome()%></td>
                        <td><%= aluno.getEmail()%></td>
                        <td><%= aluno.getAnoIngresso()%></td>
                        <td><%= aluno.getNomeCurso()%></td>
                        <td>
                            <!-- Botão para editar aluno -->
                            <a href="/buscarAluno?id=<%= aluno.getId()%>" class="btn btn-link" title="Editar">
                                <i class="bi bi-pencil" style="font-size: 20px;"></i>
                            </a>
                            <form action="deletarAluno" method="post" style="display:inline;">
                                <input type="hidden" name="alunoId" value="<%= aluno.getId()%>">
                                <button type="submit" class="btn btn-danger">Excluir</button>
                            </form>
                        </td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="5" class="text-center">Nenhum aluno cadastrado.</td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>

        <!-- Botão flutuante para chamar a página de cadastro de livros -->
        <a href="index.jsp" class="btn btn-secondary floating-button-back">
            <span style="font-size: 1.5em;">Voltar</span>
        </a>
        <a href="/visualizarCursos" class="btn btn-primary floating-button">
            <span style="font-size: 1.5em;">+ Cadastrar Aluno</span>
        </a>
        <!-- Adicione o link para o arquivo JS do Bootstrap (opcional, para funcionalidades extras) -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
