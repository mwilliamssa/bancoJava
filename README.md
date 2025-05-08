# 💳 Simulador de Conta Bancária em Java

Este projeto é uma aplicação simples em Java que simula uma conta bancária com funcionalidades básicas, como consultar saldo, realizar depósitos (via PIX) e efetuar saques. A aplicação é totalmente interativa via terminal.

> 💡 **Projeto desenvolvido como parte do curso [Java: criando a sua primeira aplicação](https://www.alura.com.br/curso-online-java-criando-primeira-aplicacao) da Alura.**

## 📋 Funcionalidades

- ✅ Exibição dos dados iniciais do cliente
- 💰 Consulta de saldo da conta
- ➕ Depósito de valores
- ➖ Saques com verificação de saldo disponível
- ❌ Encerramento seguro da aplicação

## 📌 Tecnologias utilizadas

- **Java** (recomendado Java 17 ou superior)
- **Scanner** para entrada de dados no console

## ▶️ Como executar

1. Copie o código ou clone o repositório.
2. Compile o código no terminal com:

```bash
javac Main.java
```

3. Execute o programa com:

```bash
java Main
```

## 🧠 Lógica do programa

- O programa inicia mostrando os dados do cliente (nome, tipo de conta e saldo).
- Em seguida, apresenta um menu com quatro opções:
  1. **Consultar saldo**
  2. **Receber valor**
  3. **Saque** (com validação de saldo)
  4. **Sair**
- Em tentativas de saque com valor superior ao saldo, o usuário é informado e pode tentar novamente ou encerrar a operação.

## 🧪 Exemplo de uso

```
Dados do cliente:

Nome do cliente: Matheus Williams
Tipo de conta do cliente: Corrente
Saldo do cliente: R$2500.00

Operações

1- Consultar saldos
2- Receber valor
3- Saque
4- sair

Digite a opção desejada:
```

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Sinta-se à vontade para usar, modificar e compartilhar.
