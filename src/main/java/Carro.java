import java.util.ArrayList;
import java.util.List;

class Carro extends Veiculo {
  private String modelo;
  private String marca;
  private int ano;
  private int numPortas;
  private List<Acessorio> acessorios;

  public Carro(String modelo, String marca, int ano, int numPortas, String id) {
    super(id);
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    this.numPortas = numPortas;
    this.acessorios = new ArrayList<Acessorio>();
  }

  public void abrirPorta() {
    System.out.println("Abrindo porta do carro.");
  }

  public void adicionarAcessorio(Acessorio acessorio) {
    acessorios.add(acessorio);
  }

  public void removerAcessorio(Acessorio acessorio) {
    acessorios.remove(acessorio);
  }

  @Override
  public void acelerar() {
    System.out.println("O carro está acelerando rapidamente.");
  }

  public String toString() {
    return "Carro: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Acessórios: " + acessorios;
  }
}
