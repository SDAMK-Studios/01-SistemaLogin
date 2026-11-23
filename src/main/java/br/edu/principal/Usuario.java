package br.edu.principal;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validar(String loginDigitado, String senhaDigitada) {
        return this.login.equals(loginDigitado) && this.senha.equals(senhaDigitada);
    }
}