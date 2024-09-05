import java.util.*;
import java.util.Scanner;

class Array{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        // input Size of the Array
        System.out.print("Enter the Size of the Array: ");
        int size = scan.nextInt();

        // Define Array 
        int[] array = new int[size];

        // taking input Array
        for (int i=0; i<size; i++){
            array[i] = scan.nextInt();
        }

        // printing array
        for (int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}