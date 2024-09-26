/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.service;

import com.fatec.alunos.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {

    private static List<Aluno> listaDeAlunos = new ArrayList<>();

    // Método para listar todos os alunos
    public List<Aluno> getAllAlunos() {
        return new ArrayList<>(listaDeAlunos);
    }

    // Método para adicionar um aluno à lista
    public void adicionarAluno(Aluno aluno) {
        listaDeAlunos.add(aluno);
    }

    // Método para deletar um aluno pelo ID
    public boolean deletarAluno(String id) {
        return listaDeAlunos.removeIf(aluno -> (aluno.getId() == null ? id == null : aluno.getId().equals(id)));
        // Retorna true se o aluno foi removido, false caso contrário
    }

   // Método para editar um aluno
    public boolean editarAluno(String id, Aluno novoAluno) {
        for (int i = 0; i < listaDeAlunos.size(); i++) {
            Aluno aluno = listaDeAlunos.get(i);
            if (aluno.getId() == null ? id == null : aluno.getId().equals(id)) {
                listaDeAlunos.set(i, novoAluno); // Substitui o aluno pelo novo
                return true; // Retorna true se a edição foi bem-sucedida
            }
        }
        return false; // Retorna false se o aluno com o id não foi encontrado
    }
    // Método para buscar aluno por ID
    public Aluno buscarAlunoPorId(String id) {
    for (Aluno aluno : listaDeAlunos) {
        if (aluno.getId() == null ? id == null : aluno.getId().equals(id)) {
            return aluno; // Retorna o aluno encontrado
        }
    }
    return null; // Retorna null se o aluno com o ID não foi encontrado
}

}
