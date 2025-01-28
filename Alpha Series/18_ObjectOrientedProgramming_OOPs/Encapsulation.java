// Public Class name should be same as the file Name
public class Encapsulation {

    public static void main(String args[]) {

        // Creating an Object of a class
        Pen p1 = new Pen();         // new keyword is used to create an memory in heap for this object and Pen() is constructor used to initiate an object

        p1.setColor("Blue");        // setters functions are used
        p1.setTip(5);

        p1.color = "Yellow";        // Directly set the value (not prefferable)
    
        // System.out.println(p1.color);
        // System.out.println(p1.tip);


        // Access Modifiers -> Getters and Setters
        Account acc1 = new Account();
        // acc1.userName = "Rohan Singh";        
        acc1.setName("Rohan Singh");                 // its accessible within package   

        // acc1.password = "pass123";                // its private, can't set directly
        acc1.setPass("pass123");

        System.out.println("Account Details: UserName = '" + acc1.getName() + "' and Password = '" + acc1.getPass() + "'");
    }

}


// Class is a blueprint of an object
class Pen {
    String color;
    int tip;

    // Setter Function
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Account {

    // Default (within package)
    String userName;

    // private -> access within Account class
    private String password;

    // Getters
    String getName() {
        return this.userName;
    }
    String getPass() {
        return this.password;
    }

    // Setters
    void setName(String name){
        this.userName = name;
    }

    void setPass(String pass){
        this.password = pass;
    }
}