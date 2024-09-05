import java.util.*;

class PrintName{

    public static String fullName(String firstName, String lastName){
        String fullName = firstName+" "+lastName;
        return fullName;
    }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first Name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter your last Name: ");
        String lastName = scan.nextLine();

        System.out.println("Student full Name is : "+fullName(firstName, lastName));
    }
}