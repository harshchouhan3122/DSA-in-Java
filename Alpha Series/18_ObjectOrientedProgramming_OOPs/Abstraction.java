public class Abstraction {

    public static void main(String args[]){
        Mustang myHorse = new Mustang();
        myHorse.eat();

    }
}

abstract class Animal {
    Animal(){
        System.out.println("Animal Contructor Called...");
    }

    abstract void eat();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor Called...");
    }

    void eat() {
        System.out.println("Horse eats grass...");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor Called...");
    }

    // Method Overriding -> (Same name diff functionality)
    void eat() {
        System.out.println("Mustang eats grass...");
    }
}