package br.com.desafio.conta;

public class Poupanca extends AConta {

    public Poupanca() {
        super();
        super.criarConta("Poupança");
    }

    @Override
    public void exibirDados() {
        super.mostrarDadosConta();
    }
}
