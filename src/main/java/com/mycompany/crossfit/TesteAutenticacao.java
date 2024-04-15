package com.mycompany.crossfit;

public class TesteAutenticacao {
    public static void main(String[] args) {
        GerenteTi gt = new GerenteTi();
        AssistenteRH assistenteRH = new AssistenteRH();
        AuditorRH auditorRH = new AuditorRH();

        gt.setSenha("123");
        assistenteRH.setSenha("321");
        auditorRH.setSenha("451");

        System.out.println(gt.autenticaSenha("123"));
        System.out.println(assistenteRH.autenticaSenha("123"));
        System.out.println(auditorRH.autenticaSenha("451"));
    }
}
