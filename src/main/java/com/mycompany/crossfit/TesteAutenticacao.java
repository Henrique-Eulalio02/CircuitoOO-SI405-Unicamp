package com.mycompany.crossfit;

public class TesteAutenticacao {
    public static void main(String[] args) {
        GerenteTi gt = new GerenteTi();
        
        gt.setSenha("123");
        
        System.out.println(gt.autenticaSenha("123", "123", "12312312312"));
    }
}