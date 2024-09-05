import java.util.Scanner;

class Pattern13 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        sc.close();

        int n = 5;

        for(int i=0; i<n; i++){

            // Spaces
            for(int j=0; j<(n-1)-i; j++){
                System.out.print("  ");
            }
            
            // Numbers
            for(int k=i+1; k>0; k--){
                System.out.print(k+" ");
            }

            for(int l=2; l<=i+1; l++){
                System.out.print(l+" ");
            }

            System.out.println();
        }              
    }
}