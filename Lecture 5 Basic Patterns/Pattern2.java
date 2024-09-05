import java.util.Scanner;

class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        // System.out.print("m : ");
        // int m = sc.nextInt();
        // int m = 5;
        int m = n+2;
        sc.close();

        for (int i=0; i<n; i++){
            
            // for (int j=0; j<m; j++){
            //     if (i==0 || i==n-1){
            //         System.out.print("* ");
            //     }

            //     else{
            //         if (j==0 || j==m-1){
            //             System.out.print("* ");
            //         }
            //         else{
            //             System.out.print("  ");
            //         }
            //     }
            // }

            for (int j=0; j<m; j++){
                if (i==0 || i==n-1 || j==0 || j==m-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

                
        System.out.println("_____________________________________");
    }
}
