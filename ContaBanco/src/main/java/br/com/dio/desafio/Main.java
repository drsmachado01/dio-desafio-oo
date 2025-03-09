package br.com.dio.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();
        System.out.println("Por favor, digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        Integer numero = Integer.parseInt(sc.nextLine());
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o saldo da Conta: ");
        Double saldo = Double.parseDouble(sc.nextLine());
        contaTerminal.abrirConta(numero, agencia, nome, saldo);
        System.out.println(contaTerminal);
    }
}