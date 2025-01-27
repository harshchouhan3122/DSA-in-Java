import java.util.*;

class ToDecimal{

    public static void main(String args[]){
        String binNum = "1111";

        int decNum = Integer.parseInt(binNum, 2);

        String binNum2 = Integer.toBinaryString(decNum);

        System.out.println("Binary : "+ binNum);
        System.out.println("Decimal : "+ decNum);
        System.out.println("Binary 2: "+ binNum2);
    }
}