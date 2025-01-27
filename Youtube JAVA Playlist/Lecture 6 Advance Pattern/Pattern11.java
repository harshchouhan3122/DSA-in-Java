import java.util.Scanner;

class Pattern11 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        sc.close();

        int n = 5;

        for(int i=0; i<n; i++){
            for(int k=0; k<n-i; k++){
                System.out.print("  ");
            }
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
