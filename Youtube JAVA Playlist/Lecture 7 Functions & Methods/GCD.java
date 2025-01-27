import java.util.*;

class GCD{

    public static int gcd(int n1, int n2){

       while(n2 != 0){
        int temp = n2;
        n2 = n1 % n2 ;
        n1 = temp;
       }

       return n1;

    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = scan.nextInt();
        scan.close();

        System.out.println("GCD is : "+ gcd(num1, num2));
    }
}