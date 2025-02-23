public class ContaPoupanca extends Conta implements Investimento {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldo, String titular, double taxaRendimento) {
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void reajustar() {
        if (saldo > 0) {
            saldo += saldo * taxaRendimento;
        }

        @Override
        public void reajustar(double taxa) {
            if (saldo > 0) {
                saldo += saldo * taxa;
            }
        }

        public double getTaxaRendimento() {
            return taxaRendimento;
        }
    }