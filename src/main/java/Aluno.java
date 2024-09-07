public class Aluno {
  private String nome;
  private int idade;

  public Aluno(String nome, int idade) {
    this.nome = nome;
    setIdade(idade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    if (idade >= 0) {
      this.idade = idade;
    } else {
      System.out.println("Idade inválida!");
    }
  }

  @Override
  public String toString() {
    return "Aluno: " + nome + ", Idade: " + idade;
  }
}