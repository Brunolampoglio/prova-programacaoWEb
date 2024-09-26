package com.fatec.alunos.model;

/**
 *
 * @author Muralis
 */
public class Aluno {

    private String id;
    private String nome;
    private String email;
    private String nomeCurso;
    private String anoIngresso;

    // Construtor
    public Aluno(String id, String nome, String email, String anoIgresso, String nomeCurso ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.anoIngresso = anoIgresso;
        this.nomeCurso = nomeCurso;
        
    }

    public Aluno(String nome, String email, String anoIgresso, String nomeCurso) {
        this.nome = nome;
        this.email = email;
        this.anoIngresso = anoIgresso;
        this.nomeCurso = nomeCurso;
        
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
}
