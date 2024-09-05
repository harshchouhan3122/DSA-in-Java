import java.util.Scanner;

class Pattern12 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        sc.close();

        int n = 5;
        int val = 1;

        for(int i=0; i<n; i++){
            
            for(int j=n-1-i; j>0; j--){
                System.out.print(" ");
            }

            for(int k=1; k<=i+1; k++){
                System.out.print(val+" ");
            }

            System.out.println();
            val++;
        }

    }
}
