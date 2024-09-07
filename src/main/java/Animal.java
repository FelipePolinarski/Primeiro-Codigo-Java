class Animal {
  public void fazerSom() {
    System.out.println("Animal faz um som.");
  }
}

class Leao extends Animal {
  @Override
  public void fazerSom(){
    System.out.println("Leão ruge.");
  }
}

class Elefante extends Animal {
  @Override
  public void fazerSom(){
    System.out.println("Elefante trombeta.");
  }
}

class Cachorro extends Animal {
  @Override
  public void fazerSom(){
    System.out.println("Cachorro late.");
  }
}

class Gato extends Animal{
  @Override
  public void fazerSom(){
    System.out.println("Gato mia.");
  }
}