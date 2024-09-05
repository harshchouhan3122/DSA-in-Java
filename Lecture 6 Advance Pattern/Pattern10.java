import java.util.Scanner;

class Pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
   
        int n = 8;

        // First Half
        for(int i=1; i<=n/2; i++){

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int k=1; k<=(n-2*i); k++){
                System.out.print("  ");
            }
            for(int l=1; l<=i; l++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // Second Half
        for(int i=1; i<=n/2; i++){

            for(int j=1; j<=((n/2)+1-i); j++){
                System.out.print("* ");
            }
            for(int k=1; k<=(2*(i-1)); k++){
                System.out.print("  ");
            }
            for(int l=1; l<=((n/2)+1-i); l++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
