class Dog {
    int size;
    String name;

    void bark(int numOfBarks) {
        if (size > 60) {
            while (numOfBarks > 0) {
                System.out.println(name + " say Wooof!");
                numOfBarks = numOfBarks - 1;
            }
        } else if (size > 14) {
            while (numOfBarks > 0) {
                System.out.println(name + " say Ruff!");
                numOfBarks = numOfBarks - 1;
            }
        } else {
            while (numOfBarks > 0) {
                System.out.println(name + " say Yip!");
                numOfBarks = numOfBarks - 1;
            }
        }
    }
}

public class DogsTestDrive {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Bob";
        d1.size = 66;
        Dog d2 = new Dog();
        d2.name = "Tadeu";
        d2.size = 22;
        Dog d3 = new Dog();
        d3.name = "Jubileu";
        d3.size = 5;

        d1.bark(3);
        d2.bark(4);
        d3.bark(2);
    }
}
