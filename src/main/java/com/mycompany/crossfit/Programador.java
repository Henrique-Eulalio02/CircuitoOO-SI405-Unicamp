package com.mycompany.crossfit;

public class Programador extends Funcionario {

    private int crp;

    public Programador() {
    }

    public Programador(int crp, String nome, String cpf) {
        super(nome, cpf);
        this.crp = crp;
    }

    public Programador(int crp, String nome, String cpf, String dataNasc, int numDepentes, double salario) {
        super(nome, cpf, dataNasc, numDepentes, salario);
        this.crp = crp;
    }

    public int getCrp() {
        return crp;
    }

    public void setCrp(int crp) {
        this.crp = crp;
    }

    @Override
    public String saudacao() {
        return "Bem vindo programador! " + getNome();
    }

    @Override
    public double getBonusAnual() {
        return (super.getSalario() * 0.2);
    }
}
