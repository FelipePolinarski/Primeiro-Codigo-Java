public class Filme {
  private String titulo;
  private int anoLancamento;
  private int duracao;

  public Filme(String titulo, int anoLancamento, int duracao) {
    this.titulo = titulo;
    this.anoLancamento = anoLancamento;
    this.duracao = duracao;
  }

  public String getTitulo() {
    return titulo;
  }

  public int anoLancamento() {
    return anoLancamento;
  }

  public int getDuracao() {
    return duracao;
  }

  @Override
  public String toString() {
    return "Filme: " + titulo + ", ano: " + anoLancamento + ", duração: " + duracao + " minutos.";
  }
}