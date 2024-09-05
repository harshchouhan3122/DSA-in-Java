import java.util.Scanner;

class Pattern9 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("n : ");
        int n = sc.nextInt();
        sc.close();
        
        // int state = 1;
        // for(int i=1; i<=n; i++){
        //     if (i%2==0){
        //         state = 0;
        //     }
        //     else{
        //         state = 1;
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(state+" ");
                
        //         if (state==1){state=0;}
        //         else{state=1;}
        //     }        
        //     System.out.println();
        // }

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
