class Dog {
    String name;

    public static void main (String [] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Pretinho";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Bolota";
        myDogs[1].name = "Salsicha";

        System.out.print("O nome do último cachorro é ");
        System.out.println(myDogs[2].name);

        int x = 0;

        while(x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }

        myDogs[0].eat();
        myDogs[1].chaseCat();
    }

    public void bark(){
        System.out.println(name + " diz Ruff!");
    }

    public void eat() {
        System.out.println(name + " faz nhom nhom nhom!");
    }

    public void chaseCat() {
        System.out.println(name + " diz Au Au Au Au Au!");
    }
}