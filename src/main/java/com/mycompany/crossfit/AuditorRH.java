package com.mycompany.crossfit;

public class AuditorRH implements AutenticaSenha {
    private int id;
    private String senha;

    public AuditorRH(){};

    public AuditorRH(int id, String senha) {
        this.id = id;
        this.senha = senha;
    };

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean autenticaSenha(String senha) {
        return (this.senha).equals(senha);
    }
}
