import java.util.Scanner;

class Pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        sc.close();
        
        for(int i=0; i<n; i++){

            for(int k=0; k<(n-1-i); k++){
                System.out.print("  ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
        
            System.out.println();

        }
    }
}
