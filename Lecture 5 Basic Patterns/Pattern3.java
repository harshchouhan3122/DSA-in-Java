import java.util.Scanner;

class Pattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        // System.out.print("m : ");
        // int m = sc.nextInt();
        // int m = n;

        sc.close();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

                
        System.out.println("_____________________________________");
    }
}
