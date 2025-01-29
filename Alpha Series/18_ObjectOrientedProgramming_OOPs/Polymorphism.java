public class Polymorphism {

    public static void main(String args[]){
        Calculator cal = new Calculator();
        System.out.println(cal.Sum(1, 2));
        System.out.println(cal.Sum((float) 3, (float) 2.5));    //automatically consider it as double
        System.out.println(cal.Sum(1, 2, 3));

        Mammal cow = new Mammal();
        cow.eat();
    }
}

// Method Overloading -> Same name diff parameters with same functionality
class Calculator {

    int Sum(int a, int b){
        return (a+b);
    }

    int Sum(int a, int b, int c){
        return (a+b+c);
    }

    float Sum(float a, float b){
        return a+b ;
    }

}


class Animal {
    void eat() {
        System.out.println("Animal can Eat...");
    }
}

class Mammal extends Animal {
    // Method Overriding (Same name different functionality)
    void eat() {
        System.out.println("Mammals can Eat...");
    }
}