public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente, double saldoInicial, double limiteChequeEspecial) {
        super(cliente, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println("Limite Cheque Especial: " + this.limiteChequeEspecial);
    }
}