/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.alunos.model;

/**
 *
 * @author Muralis
 */
public class Curso {

    private String id;
    private String nome;

    // Construtor
    public Curso(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    //Getters e Setters 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
