public class Main {
  public static void main(String[] args) {
    Filme filme1 = new Filme("O Poderoso Chefão", 1972, 152);
    Filme filme2 = new Filme("O Poderoso Chefão II", 1974, 230);
    Filme filme3 = new Filme("O Poderoso Chefão III", 1975, 200);
    Filme filme4 = new Filme("O Poderoso Chefão IV", 1976, 170);

    Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
    Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1821);
    Livro livro3 = new Livro("Os Maias", "Eça de Queirós", 1605);
    Livro livro4 = new Livro("A Divina Comédia", "Dante Alighieri", 1320);

    LivroInfantil livroI1 = new LivroInfantil("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 8);
    LivroInfantil livroI2 = new LivroInfantil("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 8);
    LivroInfantil livroI3 = new LivroInfantil("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 5);
    LivroInfantil livroI4 = new LivroInfantil("O Livro de Evocação", "Fernando Pessoa", 1985, 5);

    Carro carro1 = new Carro("Fusca", "Volkswagen", 1938, 4, "fffj");
    Carro carro2 = new Carro("Gol", "Volkswagen", 1948, 2, "fffh");
    Carro carro3 = new Carro("Uno", "Fiat", 1970, 4, "fffg");
    Carro carro4 = new Carro("Celta", "Chevrolet", 1967, 4, "ffff");

    Acessorio acessorio1 = new Acessorio("Farol", "Farol de cruzamento");
    Acessorio acessorio2 = new Acessorio("Lanterna", "Lanterna de cruzamento");
    Acessorio acessorio3 = new Acessorio("Lanterna", "Lanterna de trânsito");
    Acessorio acessorio4 = new Acessorio("Banco", "Banco de couro");

    Aluno aluno1 = new Aluno("João", 20);
    Aluno aluno2 = new Aluno("Maria", 22);
    Aluno aluno3 = new Aluno("Pedro", 17);
    Aluno aluno4 = new Aluno("Ana", 19);

    Animal animal1 = new Leao();
    Animal animal2 = new Elefante();
    Animal animal3 = new Cachorro();
    Animal animal4 = new Gato();

    ContaCorrente cc = new ContaCorrente(1000, 1, 0.05);
    ContaPoupanca cp = new ContaPoupanca(1000, 2, 0.05);

    System.out.println("--------------------------------------------------------------------");
    cc.sacar(100);
    cp.aplicarRendimento();
    System.out.println("Saldo conta corrente: " + cc.getSaldo());
    System.out.println("Saldo conta poupança: " + cp.getSaldo());
    System.out.println("--------------------------------------------------------------------");
    animal1.fazerSom();
    animal2.fazerSom();
    animal3.fazerSom();
    animal4.fazerSom();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(aluno1);
    System.out.println(aluno2);
    System.out.println(aluno3);
    System.out.println(aluno4);
    System.out.println("--------------------------------------------------------------------");
    System.out.println(filme1);
    System.out.println(filme2);
    System.out.println(filme3);
    System.out.println(filme4);
    System.out.println("--------------------------------------------------------------------");
    System.out.println(livro1);
    System.out.println(livro2);
    System.out.println(livro3);
    System.out.println(livro4);
    System.out.println("--------------------------------------------------------------------");
    livroI1.imprimirDetalhes();
    livroI2.imprimirDetalhes();
    livroI3.imprimirDetalhes();
    livroI4.imprimirDetalhes();
    System.out.println("--------------------------------------------------------------------");
    System.out.println(carro1);
    System.out.println(carro2);
    System.out.println(carro3);
    System.out.println(carro4);
    System.out.println("--------------------------------------------------------------------");
    carro1.adicionarAcessorio(acessorio1);
    carro1.acelerar();
    carro1.abrirPorta();
    carro1.frear();
    carro2.adicionarAcessorio(acessorio2);
    carro3.adicionarAcessorio(acessorio3);
    carro4.adicionarAcessorio(acessorio4);
    System.out.println("--------------------------------------------------------------------");
  }

}