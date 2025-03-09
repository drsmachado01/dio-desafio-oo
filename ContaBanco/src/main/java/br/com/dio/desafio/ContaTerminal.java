package br.com.dio.desafio;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public void abrirConta(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Olá ");
        sb.append(this.nomeCliente);
        sb.append(", obrigado por criar uma conta em nosso banco, sua agência é ");
        sb.append(this.agencia);
        sb.append(", conta ");
        sb.append(this.numero);
        sb.append(" e seu saldo ");
        sb.append(this.saldo);
        sb.append(" já está disponível para saque");
        return sb.toString();
    }
}
