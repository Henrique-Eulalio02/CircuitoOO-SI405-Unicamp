package com.mycompany.crossfit;

public class Crossfit {

    public static void main(String[] args) {
        Programador p = new Programador();
        CientistaDados cd = new CientistaDados();
        GerenteTi gt = new GerenteTi();
        DevFrontEnd fe = new DevFrontEnd();

        p.setNome("eduardo");
        p.setCpf("312312312312");
        p.setDataNasc("02/03/2003");
        p.setNumDepentes(2);
        p.setSalario(14.500);
        p.setCrp(123);

        cd.setNome("henrique");
        cd.setCpf("65645645645");
        cd.setDataNasc("07/01/2003");
        cd.setNumDepentes(4);
        cd.setSalario(17.500);
        cd.setCrcd(1235);

        gt.setNome("caio");
        gt.setCpf("76746546456");
        gt.setDataNasc("09/12/2005");
        gt.setNumDepentes(10);
        gt.setSalario(23.500);
        gt.setNumFunc(3);
        gt.setRamal("ramal");

        fe.setNome("caio");
        fe.setCpf("76746546456");
        fe.setDataNasc("09/12/2005");
        fe.setNumDepentes(10);
        fe.setSalario(23.500);
        fe.setCrpw(123321);
        fe.setCrp(133);

        System.out.println("Bonus Anual: " + p.getBonusAnual());
        System.out.println("Bonus Anual: " + cd.getBonusAnual());
        System.out.println("Bonus Anual: " + gt.getBonusAnual());
        System.out.println("Bonus Anual: " + fe.getBonusAnual());
        System.out.println(p.saudacao());
        System.out.println(cd.saudacao());
        System.out.println(gt.saudacao());
        System.out.println(fe.saudacao());
    }
}
