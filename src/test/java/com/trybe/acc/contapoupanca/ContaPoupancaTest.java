package com.trybe.acc.contapoupanca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContaPoupancaTest {

  @Test
  @DisplayName("1 - [Conta Poupança] Criar uma classe ContaPoupanca")
  public void testeConstrutor() {
    ContaPoupanca objTeste = new ContaPoupanca("Carla Pereira", 5000);
    assertEquals(5000, objTeste.mostrarSaldo());
    assertEquals("Carla Pereira", objTeste.mostrarTitularConta());
  }

  @Test
  @DisplayName("2 - [Conta Poupança] Implementar o método 'depositar'")
  public void testeDepositar() {
    ContaPoupanca objTeste = new ContaPoupanca("Carla Pereira", 5000);
    objTeste.depositar(500);
    assertEquals(5500, objTeste.mostrarSaldo());
  }

  @Test
  @DisplayName("3 - [Conta Poupança] Implementar o método 'sacar'")
  public void testeSacar() {
    ContaPoupanca objTeste = new ContaPoupanca("Carla Pereira", 5000);
    objTeste.sacar(500);
    assertEquals(4500, objTeste.mostrarSaldo());
  }

  @Test
  @DisplayName("4 - [Conta Poupança] Implementar o método 'mostrarSaldo'")
  public void testeMostrarSaldo() {
    ContaPoupanca objTeste = new ContaPoupanca("Carla Pereira", 5000);
    assertEquals(5000, objTeste.mostrarSaldo());
  }

  @Test
  @DisplayName("5 - [Conta Poupança] Implementar o método 'mostrarTitularConta'")
  public void testeMostrarTitularConta() {
    ContaPoupanca objTeste = new ContaPoupanca("Carla Pereira", 5000);
    assertEquals("Carla Pereira", objTeste.mostrarTitularConta());
  }

}
