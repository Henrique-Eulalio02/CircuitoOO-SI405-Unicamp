package com.mycompany.crossfit;

public class DevFrontEnd extends Funcionario{
    private int crpw;

    public DevFrontEnd(){}

    public DevFrontEnd(int crpw) {
        this.crpw = crpw;
    }

    public int getCrpw() {
        return crpw;
    }

    public void setCrpw(int crpw) {
        this.crpw = crpw;
    }

    @Override
    public double getBonusAnual() {
        return (super.getSalario() * 0.5);
    }

    @Override
    public String saudacao() {
        return "Bem vindo programador dev front end! " + getNome();
    }
}
