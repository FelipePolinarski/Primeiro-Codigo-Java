class LivroInfantil extends Livro {
  private int idadeRecomendada;

  public LivroInfantil(String titulo, String autor, int anoPublicacao, int idadeRecomendada) {
    super(titulo, autor, anoPublicacao);
    this.idadeRecomendada = idadeRecomendada;
  }

  public void imprimirDetalhes() {
    super.imprimirDetalhes();
    System.out.println("Idade Recomendada: " + idadeRecomendada);
  }
}