public class ContaPoupanca extends Conta {

    private static final double TAXA_RENDIMENTO = 0.02;

    public ContaPoupanca(Cliente cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarRendimento() {
        double rendimento = this.saldo * TAXA_RENDIMENTO;
        this.saldo += rendimento;
        System.out.println("Rendimento aplicado: " + rendimento);
        System.out.println("Novo saldo da Conta Poupança: " + this.saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}