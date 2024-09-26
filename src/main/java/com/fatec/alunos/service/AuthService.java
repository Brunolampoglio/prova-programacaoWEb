package com.fatec.alunos.service;

/**
 *
 * @author Muralis
 */
public class AuthService {

    public boolean authenticate(String username, String password) {

        // Lógica de autenticação fictícia (troque por validação real)
        return "admin".equals(username) && "admin123".equals(password);
    }
}
