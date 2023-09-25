<div align="center">
  <h1><strong>Exercício de POO de um <br> Sistema de Recursos Humanos em Java 👨‍💼</h1>
  </div>

## <strong>🧰Tecnologias, linguagens e ferramentas:</strong><br />
  <div align="center">
    <a href="https://github.com/PFonsecaFV/PFonsecaFV">
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_java.svg" width="60" fill="none" />
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_maven.svg" width="60" fill="none" />
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_junit.svg" width="60" fill="none" />
  </a>
  </div>
  

## <strong>🎯Habilidades Utilizadas</strong><br />

- Utilizar conceitos de abstração para criar classes em Java.
- Implementar getters e setters em classes de programação para acessar e modificar atributos.
- Utilizar o encapsulamento para ocultar o estado interno de um objeto e a herança para criar classes derivadas de outras classes.

Este exercício visa explorar e praticar a lógica de programação e POO em Java.

## 📝Orientações para instalar e testar o projeto

1. Crie um diretório usando o comando mkdir e entre no diretório:
	```bash
	mkdir patrick-fonseca-java-exercicios && cd patrick-fonseca-java-exercicios
	```
 2. Clone o repositório e use o comando no terminal:
	```bash
	git clone git@github.com:PFonsecaFV/java-exercicio-lista-poo.git
	```
3. Acesse o diretório do projeto:
	```bash
	cd java-exercicio-lista-poo
	```
4. Instale suas dependências:
	```bash
	mvn install
	```

## ✅ O que foi desenvolvido

### 1. **Sistema de Recursos Humanos:**

  Implementei a classe `PessoaFuncionaria` com os atributos privados:
  - `nomeCompleto`: do tipo `String`.
  - `cpf`: do tipo `String`.
  - `endereco`: do tipo `String`.
  - `salario`: do tipo `double`.

    Exemplo:
    Se uma nova pessoa contratada for:
    ```html
      Nome: Maria da Silva;
      CPF: 158.699.457-31;
      Endereço: Rua da Aurora, 118;
      Salário: 15000.
    ```

### 2. **Conta Poupança:**

  Implementei a classe `ContaPoupanca` que representa uma conta bancária.
  - `saldo`: do tipo `double`.
  - `titularConta`: do tipo `String`.

    Exemplo:
    A classe deve possuir métodos para depositar, sacar, mostrar o saldo e mostrar o titular da conta.
    ```html
      Se uma conta poupança for aberta 
      com um depósito inicial de R$ 50
      em nome de Carla Pereira, os métodos devem
      se comportar como descrito.
    ```

### 3. **Pessoa Usuária:**
  Criei um sistema para gerar o nome de uma pessoa usuária seguindo os critérios:
  - Uma classe `Pessoa` com atributos `nome` e `sobrenome`.
  - Uma classe `PessoaUsuaria` que recebe nome e sobrenome no construtor e possui um método `getPessoaUsuaria` para gerar o nome no formato "nome.sobrenome".

    Exemplo:
    - `new PessoaUsuaria("bruce", "wayne")` deve retornar `bruce.wayne`.
    - `new PessoaUsuaria(null, "wayne")` ou `new PessoaUsuaria("", "wayne")` deve retornar `Pessoa usuária inválida`.

## 🛠️ Testes

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

---

<div align="center">
  <h2>Patrick Fonseca</h2>
	  <a href="https://www.linkedin.com/in/PatrickFonseca/" target="_blank">
      <img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank">
    </a>
</div>
