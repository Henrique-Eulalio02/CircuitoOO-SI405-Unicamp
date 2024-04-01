package com.mycompany.crossfit;

public class GerenteTi extends Funcionario{

    private int numFunc;
    private String ramal;
    private String senha;

    public GerenteTi() {
    }

    public GerenteTi(int numFunc, String ramal, String senha, String nome, String cpf) {
        super(nome, cpf);
        this.numFunc = numFunc;
        this.ramal = ramal;
        this.senha = senha;
    }

    public GerenteTi(int numFunc, String ramal, String senha, String nome, String cpf, String dataNasc, int numDepentes, double salario) {
        super(nome, cpf, dataNasc, numDepentes, salario);
        this.numFunc = numFunc;
        this.ramal = ramal;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public String getRamal() {
        return ramal;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    @Override
    public String saudacao() {
        return "Bem vindo gerente! " + getNome();
    }

    @Override
    public double getBonusAnual(){
        return ((super.getSalario() * 0.1) * this.numFunc) * this.getSalario();
    }

    public boolean autenticaSenha(String senha, String senhaG, String cpf) {
        return (senhaG).equals(senha) && cpf.length() == 11;
    }

}
