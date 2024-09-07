class Conta {
  protected double saldo;
  protected int numeroConta;


  public Conta(double saldoInicial, int numeroConta) {
    this.saldo = saldoInicial;
    this.numeroConta = numeroConta;
  }

  public void depositar(double valor) {
    saldo += valor;
  }

  public void sacar(double valor) {
    saldo -= valor;
  }

  public double getSaldo() {
    return saldo;
  }
}