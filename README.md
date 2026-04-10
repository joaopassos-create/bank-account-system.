# Sistema de Conta Bancária 🏦

Este projeto foi desenvolvido como um exercício prático para aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, especificamente focado em **Encapsulamento**, **Construtores** e **Sobrecarga**.

## 🎯 Objetivo do Projeto
O sistema simula o fluxo de abertura de uma conta bancária, permitindo o cadastro do titular, número da conta e um depósito inicial opcional. O projeto garante que regras de negócio básicas sejam respeitadas através do encapsulamento dos dados.

## 🛠️ Conceitos Aplicados
* **Encapsulamento:** Os atributos da conta (`number`, `holder` e `balance`) são protegidos por modificadores de acesso `private`. O acesso e modificação são controlados por métodos `get` e `set`.
* **Sobrecarga de Construtores:** A classe `Account` possui dois construtores para permitir a criação de contas com ou sem depósito inicial.
* **Regras de Negócio:**
    * O número da conta é imutável após a criação.
    * O nome do titular pode ser alterado a qualquer momento.
    * O saldo só pode ser alterado através dos métodos de depósito e saque.
    * Cada operação de saque possui uma taxa fixa de **$ 5.00**.

## 💻 Exemplo de Execução
```text
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00
