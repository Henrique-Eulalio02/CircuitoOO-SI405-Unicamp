package com.mycompany.crossfit;

import java.util.ArrayList;
import java.util.List;

public class Crossfit {

    public static void main(String[] args) {
        Programador p = new Programador();
        CientistaDados cd = new CientistaDados();
        GerenteTi gt = new GerenteTi();
        DevFrontEnd fe = new DevFrontEnd();

        List<Funcionario> funcionarioList = new ArrayList<Funcionario>();

        p.setNome("eduardo");
        p.setCpf("312312312312");
        p.setDataNasc("02/03/2003");
        p.setNumDepentes(2);
        p.setSalario(14.500);
        p.setCrp(123);

        funcionarioList.add(p);

        cd.setNome("henrique");
        cd.setCpf("65645645645");
        cd.setDataNasc("07/01/2003");
        cd.setNumDepentes(4);
        cd.setSalario(17.500);
        cd.setCrcd(1235);

        funcionarioList.add(cd);

        gt.setNome("caio");
        gt.setCpf("76746546456");
        gt.setDataNasc("09/12/2005");
        gt.setNumDepentes(10);
        gt.setSalario(23.500);
        gt.setNumFunc(3);
        gt.setRamal("ramal");

        funcionarioList.add(gt);

        fe.setNome("caio");
        fe.setCpf("76746546456");
        fe.setDataNasc("09/12/2005");
        fe.setNumDepentes(10);
        fe.setSalario(23.500);
        fe.setCrpw(123321);
        fe.setCrp(133);

        funcionarioList.add(fe);

        for (int i = 0; i < funcionarioList.size(); i++) {
            System.out.println(funcionarioList.get(i).getClass());
            System.out.println("Bem vindo(a) " + funcionarioList.get(i).getNome());
        }

        //System.out.println("Bonus Anual: " + p.getBonusAnual());
        //System.out.println("Bonus Anual: " + cd.getBonusAnual());
        //System.out.println("Bonus Anual: " + gt.getBonusAnual());
        //System.out.println("Bonus Anual: " + fe.getBonusAnual());
        //System.out.println(p.saudacao());
        //System.out.println(cd.saudacao());
        //System.out.println(gt.saudacao());
        //System.out.println(fe.saudacao());
    }
}
