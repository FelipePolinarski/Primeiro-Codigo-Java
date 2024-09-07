import java.util.ArrayList;
import java.util.List;

class Acessorio {
  private String nome;
  private String descricao;

  public Acessorio(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "Acessório: " + nome + ", Descrição: " + descricao;
  }
}