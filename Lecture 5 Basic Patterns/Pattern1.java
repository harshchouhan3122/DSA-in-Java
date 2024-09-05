import java.util.Scanner;

class Pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter num of rows: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int j=0;
            while(j<5){
                System.out.print("* ");
                j++;
            }
            System.out.println();

        }

        System.out.println("_____________________________________");
    }
}