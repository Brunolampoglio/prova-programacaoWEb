<%@page import="com.fatec.alunos.model.Aluno"%>
<%@page import="com.fatec.alunos.model.Curso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Editar Aluno</title>
        <!-- Link para o CSS do Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h1 class="mt-4 mb-4">Editar Aluno</h1>
            <form action="editarAluno" method="post">
                <input type="hidden" name="id" value="${aluno.id}"/> <!-- ID do aluno oculto para edição -->
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input type="text" class="form-control" id="nome" name="nome" value="${aluno.nome}" required>
                </div>
                <div class="form-group">
                    <label for="email">E-mail:</label>
                    <input type="email" class="form-control" id="email" name="email" value="${aluno.email}" required>
                </div>
                <div class="form-group">
                    <label for="anoIngresso">Ano de Ingresso:</label>
                    <input type="text" class="form-control" id="anoIngresso" name="anoIngresso" value="${aluno.anoIngresso}" required>
                </div>
                <div class="form-group d-flex align-items-center">
                    <label for="curso" class="mr-2">Curso:</label>
                    <select class="form-control mr-2" id="curso" name="curso" style="width: auto;" required>
                        <option value="">Selecione um curso</option>
                        <%
                            List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
                            if (cursos != null && !cursos.isEmpty()) {
                                for (Curso curso : cursos) {
                        %>
                        <%
                            Aluno aluno = (Aluno) request.getAttribute("aluno");
                        %>
                        <option value="<%= curso.getNome()%>" <%= aluno.getNomeCurso().equals(curso.getNome()) ? "selected" : ""%>><%= curso.getNome()%></option>
                        <%
                            }
                        } else {
                        %>
                        <option value="" disabled>Nenhum curso cadastrado. Adicione cursos primeiro.</option>
                        <%
                            }
                        %>
                    </select>
                </div>
                <a href="visualizarAlunos" class="btn btn-secondary">Voltar</a>
                <button type="submit" class="btn btn-primary">Salvar Alterações</button> <!-- Botão atualizado -->
            </form>
        </div>
        <!-- Link para o JavaScript do Bootstrap (opcional) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
