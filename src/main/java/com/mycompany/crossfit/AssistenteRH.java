package com.mycompany.crossfit;

public class AssistenteRH implements AutenticaSenha{
    private int crp;
    private String senha;

    public AssistenteRH(){};

    public AssistenteRH(int crp, String senha) {
        this.crp = crp;
        this.senha = senha;
    };

    public int getCrp() {
        return crp;
    }

    public void setCrp(int crp) {
        this.crp = crp;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticaSenha(String senha) {
        return (this.senha).equals(senha);
    }
}
