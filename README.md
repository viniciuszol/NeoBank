**NeoBank - Projeto Java**
Este é um projeto simples de banco digital desenvolvido em Java. Ele simula operações bancárias como abertura de contas, depósitos, saques, transferências e aplicação de rendimento em contas poupança.

**Funcionalidades**
- Cadastro de Clientes: Adiciona clientes com informações como nome, CPF, endereço e telefone.
- Abertura de Contas: Criação de contas correntes e contas poupança.
- Depósitos e Saques: Realiza depósitos e saques nas contas.
- Transferências: Transfere valores entre contas.
- Rendimento em Conta Poupança: Aplica 2% de rendimento nas contas poupança.
- Consulta de Extrato: Exibe o saldo e as informações das contas.
**Estrutura do Projeto**
- Banco: Gerencia clientes e contas.
- Cliente: Armazena informações do cliente.
- Conta (abstrata): Base para as contas, com métodos para saque, depósito e transferência.
- ContaCorrente: Extende Conta e inclui limite de cheque especial.
- ContaPoupanca: Extende Conta e aplica rendimento de 2% ao saldo.
- IConta: Interface que define os métodos comuns para todas as contas.
- Main: Classe de execução que simula o fluxo bancário.
**Tecnologias Utilizadas**
- Java: Linguagem de programação principal utilizada para o desenvolvimento do projeto.
- VS Code: IDE utilizada para desenvolvimento e execução do código.
- JDK: Kit de desenvolvimento necessário para compilar e rodar o código Java
