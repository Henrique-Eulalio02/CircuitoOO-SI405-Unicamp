package com.mycompany.crossfit;

import java.util.ArrayList;
import java.util.List;

public class TesteRelatorioGastos {
    public static void main(String[] args) {
        RelatorioGastos relatorioGastos = new RelatorioGastos();
        CientistaDados cientistaDados = new CientistaDados();
        GerenteTi gerenteTi = new GerenteTi();
        DevFrontEnd devFrontEnd = new DevFrontEnd();

        cientistaDados.setNome("henrique");
        cientistaDados.setCpf("65645645645");
        cientistaDados.setDataNasc("07/01/2003");
        cientistaDados.setNumDepentes(4);
        cientistaDados.setSalario(17.500);
        cientistaDados.setCrcd(1235);

        gerenteTi.setNome("caio");
        gerenteTi.setCpf("76746546456");
        gerenteTi.setDataNasc("09/12/2005");
        gerenteTi.setNumDepentes(10);
        gerenteTi.setSalario(23.500);
        gerenteTi.setNumFunc(3);
        gerenteTi.setRamal("ramal");

        devFrontEnd.setNome("caio");
        devFrontEnd.setCpf("76746546456");
        devFrontEnd.setDataNasc("09/12/2005");
        devFrontEnd.setNumDepentes(10);
        devFrontEnd.setSalario(23.500);
        devFrontEnd.setCrpw(123321);
        devFrontEnd.setCrp(133);

        List<Funcionario> funcionarioList = new ArrayList<Funcionario>();
        funcionarioList.add(cientistaDados);
        funcionarioList.add(gerenteTi);
        funcionarioList.add(devFrontEnd);

        for (int i = 0; i < funcionarioList.size(); i++) {
            relatorioGastos.atualizaValores(funcionarioList.get(i));
        }

        System.out.println(relatorioGastos.getTotalSalario());
        System.out.println(relatorioGastos.getTotalBonus());
    }
}
