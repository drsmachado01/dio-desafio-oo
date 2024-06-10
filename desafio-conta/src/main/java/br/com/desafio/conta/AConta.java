package br.com.desafio.conta;

public abstract class AConta implements Conta {
    private static int NUMERO_CONTA = 1;
    private static int NUMERO_AGENCIA = 1;
    private Double saldo = 0.0;
    private Integer agencia;
    private Integer numeroConta;
    private String tipoConta;

    @Override
    public void criarConta(String tipoConta) {
        this.tipoConta = tipoConta;
        this.agencia = NUMERO_AGENCIA++;
        this.numeroConta = NUMERO_CONTA++;
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void mostrarDadosConta() {
        System.out.println(this.tipoConta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
        System.out.printf("Saldo R$: %.2f%n", this.saldo);
    }
}
