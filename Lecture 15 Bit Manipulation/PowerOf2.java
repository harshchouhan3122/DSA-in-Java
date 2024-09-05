import java.util.*;

class PowerOf2{
    public static void main(String args []){
    int num = 32;

    // Logic 1
    int count = 0 ;
    while(num != 0 ){
        if ((num & 1) == 1){
            count ++;
        }
        num = num >> 1;
    }
    if(count == 1){
        System.out.println("Power of 2.");
    }
    else {
        System.out.println("Not a power of 2.");
    }


    // Logic 2
    if ((num & (num-1)) == 0){
        System.out.println("Power of 2.");
    } else {
        System.out.println("Not a power of 2.");
    }
}
}