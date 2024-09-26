<%@page import="com.fatec.alunos.model.Curso"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro de Aluno</title>
        <!-- Link para o CSS do Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h1 class="mt-4 mb-4">Cadastro de Aluno</h1>
            <form action="adicionarAluno" method="post">
                <div class="form-group">
                    <label for="nome">Nome:</label>
                    <input type="text" class="form-control" id="nome" name="nome">
                </div>
                <div class="form-group">
                    <label for="E-mail">E-mail:</label>
                    <input type="text" class="form-control" id="email" name="email">
                </div>
                <div class="form-group">
                    <label for="anoIngresso">Ano de Ingresso:</label>
                    <input type="text" class="form-control" id="anoIngresso" name="anoIngresso">
                </div>
                <div class="form-group d-flex align-items-center">
                    <label for="curso" class="mr-2">Curso:</label>
                    <select class="form-control mr-2" id="curso" name="curso" style="width: auto;">
                        <option value="">Selecione um curso</option>
                        <%
                            List<Curso> cursos = (List<Curso>) request.getAttribute("cursos");
                            if (cursos != null && !cursos.isEmpty()) {
                                for (Curso curso : cursos) {
                        %>
                         <option value="<%= curso.getNome() %>"><%= curso.getNome() %></option>
                        <%
                            }
                        } else {
                        %>
                        <option value="" disabled>Nenhum curso cadastrado. Adicione cursos primeiro.</option>
                        <%
                            }
                        %>
                    </select>
                    <a href="cadastrarCurso.jsp" class="btn btn-primary">+</a>
                </div>
                <a href="visualizarAlunos" class="btn btn-secondary">Voltar</a>
                <button type="submit" class="btn btn-primary">Cadastrar Aluno</button>
            </form>
        </div>
        <!-- Link para o JavaScript do Bootstrap (opcional) -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
