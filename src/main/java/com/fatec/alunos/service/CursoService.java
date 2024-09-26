/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.fatec.alunos.service;

import com.fatec.alunos.model.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muralis
 */
public class CursoService {
    private static List<Curso> listaDeCursos = new ArrayList<>();
    
    // Método para listar todos os cursos
    public List<Curso> getAllCursos() {
        return new ArrayList<>(listaDeCursos);
    }
    
    // Método para adicionar um curso
    public void adicionarCurso(Curso curso) {
        listaDeCursos.add(curso);
    }
    
}
