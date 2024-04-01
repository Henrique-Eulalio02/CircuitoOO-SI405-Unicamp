
package com.mycompany.crossfit;

public class CientistaDados extends Funcionario{

    private int crcd;

    public CientistaDados(int crcd, String nome, String cpf, String dataNasc, int numDepentes, double salario) {
        super(nome, cpf, dataNasc, numDepentes, salario);
        this.crcd = crcd;
    }

    public CientistaDados(int crcd, String nome, String cpf) {
        super(nome, cpf);
        this.crcd = crcd;
    }

    public CientistaDados() {
    }


    public int getCrcd() {
        return crcd;
    }

    public void setCrcd(int crcd) {
        this.crcd = crcd;
    }

    @Override
    public String saudacao() {
        return "Bem vindo cientista! " + getNome();
    }

    @Override
    public double getBonusAnual(){
        return (super.getSalario()) + 500;
    }

}
