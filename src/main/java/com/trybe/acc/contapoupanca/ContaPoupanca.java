package com.trybe.acc.contapoupanca;


public class ContaPoupanca {

  private String titularConta;
  private double saldo;

  /**
   * Construtor da classe ContaPoupanca.
   */
  public ContaPoupanca(String titularConta, double saldo) {
    this.titularConta = titularConta;
    this.saldo = saldo;
  }

  // Métodos depositar, sacar, mostrarSaldo e mostrarTitularConta
  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
