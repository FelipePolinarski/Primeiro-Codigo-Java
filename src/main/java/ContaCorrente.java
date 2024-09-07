class ContaCorrente extends Conta {
  private double taxaOperacao;

  public ContaCorrente(double saldoInicial, int numeroConta, double taxaOperacao) {
    super(saldoInicial, numeroConta);
    this.taxaOperacao = taxaOperacao;
  }

  @Override
  public void sacar(double valor) {
    super.sacar(valor + taxaOperacao);
  }
}