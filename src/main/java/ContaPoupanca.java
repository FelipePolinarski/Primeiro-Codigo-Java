class ContaPoupanca extends Conta {
  private double rendimento;

  public ContaPoupanca(double saldoInicial, int numeroConta, double rendimento) {
    super(saldoInicial, numeroConta);
    this.rendimento = rendimento;
  }

  public void aplicarRendimento() {
    saldo += saldo * rendimento;
  }
}