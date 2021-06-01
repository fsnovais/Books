class Dog {
  int size;
  String breed;
  String name;

  void bark() {
    System.out.println("Ruff! Ruff!");
  }
}
// Classe testadora

class DogTestDrive {
  public static void main ( String[]args){
    // Codigo de teste
    Dog d = new Dog();
    d.size = 40;
    d.bark();
  }
}