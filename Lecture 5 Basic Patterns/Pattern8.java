import java.util.Scanner;

class Pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        sc.close();
        
        int val = 1;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(val+" ");
                val++;
            }
        
            System.out.println();

        }
    }
}
