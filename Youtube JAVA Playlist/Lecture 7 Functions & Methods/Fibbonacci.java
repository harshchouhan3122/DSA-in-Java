import java.util.*;

class Fibbonacci{

    public static void fiboSeries(int term){
        int a = 0; int b= 1; int c;
        System.out.print(a+" "+b+" ");
        for(int i=0; i< term-2; i++){
            c = a+b;
            System.out.print(c+" ");
            a = b; b = c;
        }

    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num of Terms: ");
        int term = scan.nextInt();
        scan.close();

        System.out.println("fibbonacci Series: ");
        fiboSeries(term);
    }
}