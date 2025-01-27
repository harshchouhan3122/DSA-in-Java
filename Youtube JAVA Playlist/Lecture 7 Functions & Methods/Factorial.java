import java.math.BigInteger;
import java.util.*;

class Factorial{

    // public static long factorial(int num){
    //     if (num==0 || num==1){
    //         return 1;
    //     }
    //     else{
    //         return num*factorial(num-1);
    //     }
    // }

     public static BigInteger factorial(int num){
        if (num == 0 || num == 1){
            return BigInteger.ONE;
        }
        else{
            return BigInteger.valueOf(num).multiply(factorial(num - 1));
        }
    }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any Number: ");
        int num = scan.nextInt();


        System.out.println("Factorial of "+num+" is: "+factorial(num));
    }
}