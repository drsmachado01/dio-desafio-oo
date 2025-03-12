package br.com.dio.desafio.controle.fluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador();
        Scanner terminal = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int par1 = Integer.parseInt(terminal.nextLine());
        System.out.println("Informe o segundo número");
        int par2 = Integer.parseInt(terminal.nextLine());

        contador.contagem(par1, par2);
    }
}
