package br.com.desafio.conta;

public class ContaCorrente extends AConta {
    private static final String CONTA_CORRENTE = "Conta Corrente";

    public ContaCorrente() {
        super();
        super.criarConta(CONTA_CORRENTE);
    }

    @Override
    public void exibirDados() {
        super.mostrarDadosConta();
    }
}
