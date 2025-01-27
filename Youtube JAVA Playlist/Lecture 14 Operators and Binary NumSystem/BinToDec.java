import java.util.*;

class BinToDec{

    public static void main(String args[]){
        String binNum = "1010";

        int decNum = Integer.parseInt(binNum, 2);

        System.out.println("Binary : "+ binNum);
        System.out.println("Decimal : "+ decNum);
    }
}