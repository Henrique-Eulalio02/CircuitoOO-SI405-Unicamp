package com.mycompany.crossfit;

public class RelatorioGastos {
    private double totalSalario;
    private double totalBonus;

    public void atualizaValores(Funcionario f) {
        this.totalSalario += f.getSalario();
        this.totalBonus += f.getBonusAnual();
    }
}
