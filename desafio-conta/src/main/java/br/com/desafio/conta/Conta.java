package br.com.desafio.conta;

public interface Conta {
    void criarConta(String tipoConta);
    void depositar(Double valor);
    void sacar(Double valor);
    void mostrarSaldo();

    void transferir(Double valor, Conta contaDestino);

    void exibirDados();
}
