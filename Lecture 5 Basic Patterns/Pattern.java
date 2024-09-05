import java.util.Scanner;

class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        // System.out.print("m : ");
        // int m = sc.nextInt();
        // int m = n;

        sc.close();
   

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if (sum%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
