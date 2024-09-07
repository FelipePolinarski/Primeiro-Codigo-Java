class Veiculo {
  private String id;

  public Veiculo(String id) {
    this.id = id;
  }

  public void acelerar() {
    System.out.println("O veículo está acelerando.");
  }

  public void frear() {
    System.out.println("O veículo está freando.");
  }
}