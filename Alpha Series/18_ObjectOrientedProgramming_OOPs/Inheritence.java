public class Inheritence {

    public static void main(String args[]){
        Mammal Cow = new Mammal();
        Cow.eat();
        Cow.legs = 4;
        // System.out.println(Cow.legs);

        Dog Tommy = new Dog();
        Tommy.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("This func is inherited from the parent class");
    }

    void breathe() {
        System.out.println("Animal can Breathe.");
    }
}

// Single Inheritance
class Mammal extends Animal {
    int legs;

}

// Multi-level Inheritance
class Dog extends Mammal {
    int breed;
}


// Herarchial Inheritance

// Hybrid Inheritance


// Multiple Inheritance -> can be implemented in java, indirectly using Interfaces