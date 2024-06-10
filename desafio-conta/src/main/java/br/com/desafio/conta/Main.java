package br.com.desafio.conta;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(100.0);

        Conta poup = new Poupanca();
        cc.transferir(45.0, poup);

        cc.exibirDados();
        poup.exibirDados();
    }
}