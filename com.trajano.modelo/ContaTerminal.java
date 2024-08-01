package com.trajano.modelo;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor digite o seu nome: ");
        String nomeCliente = entrada.nextLine();
        System.out.println("Por favor digite o sua Agencia: ");
        String agencia = entrada.nextLine();
        System.out.println("Por favor digite o numero da sua conta: ");
        int numero = entrada.nextInt();
        System.out.println("Por favor digite o numero da sua conta: ");
        double saldo = entrada.nextDouble();

        entrada.close();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+
                ", conta "+numero+" e seu saldo "+ saldo+" já está disponível para saque");


    }
}
