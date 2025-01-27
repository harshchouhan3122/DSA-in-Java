import java.util.Scanner;

class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        sc.close();

        int n = 8;

        // First half
        for(int i=0; i<n/2; i++){

            for(int j=0; j<(n/2)-i-1; j++){
                System.out.print("  ");
            }

            for(int k=0; k<(2*i+1); k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
        // Second half
        for(int i=0; i<n/2; i++){

            for(int j=0; j<i; j++){
                System.out.print("  ");
            }

            for(int k=0; k<2*((n/2)-i)-1; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
        
                    
    }
}
            