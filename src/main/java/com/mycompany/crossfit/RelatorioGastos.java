package com.mycompany.crossfit;

public class RelatorioGastos {
    private double totalSalario;
    private double totalBonus;

    public RelatorioGastos(){}

    public RelatorioGastos(double totalSalario, double totalBonus) {
        this.totalSalario = totalSalario;
        this.totalBonus = totalBonus;
    }

    public double getTotalSalario() {
        return totalSalario;
    }

    public void setTotalSalario(double totalSalario) {
        this.totalSalario = totalSalario;
    }

    public double getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(double totalBonus) {
        this.totalBonus = totalBonus;
    }

    public void atualizaValores(Funcionario f) {
        this.totalSalario += f.getSalario();
        this.totalBonus += f.getBonusAnual();
    }
}
