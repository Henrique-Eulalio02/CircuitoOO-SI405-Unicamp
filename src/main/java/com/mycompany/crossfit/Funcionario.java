package com.mycompany.crossfit;

// classe abstrata -> classe que não será instanciada
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String dataNasc;
    private int numDepentes;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(String nome, String cpf, String dataNasc, int numDepentes, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.numDepentes = numDepentes;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getNumDepentes() {
        return numDepentes;
    }

    public void setNumDepentes(int numDepentes) {
        this.numDepentes = numDepentes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonusAnual();

    public abstract String saudacao();

    public boolean autenticaSenha(String senha, String senhaG) {
        return (senhaG).equals(senha);
    }
}
