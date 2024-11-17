public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital NeoBank");

        //criando os clientes
        Cliente claudio = new Cliente("Luíza", "123.456.789-00", "Rua A, 123", "(61) 99999-0000");
        Cliente ana = new Cliente("Davi", "987.654.321-00", "Rua B, 456", "(61) 98888-0000");

        //adicionado clientes
        banco.adicionarCliente(claudio);
        banco.adicionarCliente(ana);

        //adicionando saldo
        Conta cc = new ContaCorrente(claudio, 500.0, 1000.0);
        Conta poupanca = new ContaPoupanca(ana, 2000.0);

        //definindo as contas bancarias como Corrente ou Poupança
        banco.abrirConta(cc);
        banco.abrirConta(poupanca);

        //fazendo transferênicas e aplicando dinheiro na poupança
        cc.depositar(100);
        cc.transferir(50, poupanca);
        poupanca.aplicarRendimento();

        //imprimindo extrato
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}