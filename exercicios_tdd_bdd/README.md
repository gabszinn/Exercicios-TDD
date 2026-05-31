# Exercícios TDD e BDD com Java, JUnit e Cucumber

Este projeto contém duas atividades:

1. Calculadora de Desconto para Loja — TDD com JUnit 5.
2. Reserva de Carro por Aplicativo — TDD com JUnit 5 e BDD com Gherkin + Cucumber.

## Estrutura

```text
exercicios_tdd_bdd/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       ├── desconto/
    │       │   └── CalculadoraDesconto.java
    │       └── reserva/
    │           └── ReservaService.java
    └── test/
        ├── java/
        │   ├── desconto/
        │   │   └── CalculadoraDescontoTest.java
        │   ├── runner/
        │   │   ├── ReservaServiceTest.java
        │   │   └── ReservaRun.java
        │   └── steps/
        │       └── ReservaSteps.java
        └── resources/
            └── features/
                └── reserva.feature
```

## Como executar os testes

Dentro da pasta do projeto, rode:

```bash
mvn test
```

Esse comando executa os testes unitários da calculadora, os testes unitários da reserva e os cenários BDD do Cucumber.

## Requisitos

- Java 17 ou superior.
- Maven instalado.
