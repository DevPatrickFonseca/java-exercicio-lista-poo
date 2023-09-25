package com.trybe.acc;

import com.trybe.acc.recursoshumanos.PessoaFuncionaria;

/**
 * Classe que representa uma pessoa funcionária no sistema de recursos humanos.
 */
public class Main {

  /**
   * Método main.
   */
  public static void main(String[] args) {
    PessoaFuncionaria pessoaFuncionaria = new PessoaFuncionaria(
        "Bruce Wayne",
        "123.456.789-00",
        "Rua 1, Gotham City",
        1000000.00
    );

    System.out.println(pessoaFuncionaria.getNomeCompleto());
    System.out.println(pessoaFuncionaria.getCpf());
    System.out.println(pessoaFuncionaria.getEndereco());
    System.out.println(pessoaFuncionaria.getSalario());
  }
}
