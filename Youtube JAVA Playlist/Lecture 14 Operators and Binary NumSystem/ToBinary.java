import java.util.*;

class ToBinary{

    public static void main(String args[]){

        // int decNum = Integer.parseInt(binNum, 2);
        int decNum = 8;

        String binNum = Integer.toBinaryString(decNum);

        System.out.println("Decimal : "+ decNum);
        System.out.println("Binary : "+ binNum);
    }
}