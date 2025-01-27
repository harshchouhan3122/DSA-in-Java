import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

class BitManipulation{

    public static void main(String args[]){

        // Get Bit
        // Get the 3rd bit of n = 10,      // n = 1010
        System.out.println("Get Bit");
        int num = 10;
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & num) != 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        


        // Set Bit  -> Set the 4th bit as 1
        System.out.println("Set Bit");
        int num2 = 5;   // n = 0101
        pos = 3;
        bitMask = 1 << pos;

        // System.out.println(bitMask | num2);
        System.out.println(Integer.toBinaryString(num2));
        System.out.println(Integer.toBinaryString(bitMask | num2));


        // Clear Bit    -> Clear the 3rd bit 
        System.out.println("Clear Bit");
        num = 13;        //num = 1101
        pos = 2 ;
        bitMask = 1 << pos;

        // System.out.println( (~ bitMask) & num );
        System.out.println( Integer.toBinaryString(num));
        System.out.println( Integer.toBinaryString((~ bitMask) & num) );


        // Update Bit -> toggle the 2nd bit of the num
        System.out.println("Update Bit / Toggle Bit");
        num = 13;           //num = 1101
        num = 15;           //num = 1111
        pos = 1;
        bitMask = 1 << pos;

        // First get the bit 
        boolean flag;
        if((bitMask & num) == 0 ){
            flag = false;
        } else{
            flag = true;
        }

        System.out.println(Integer.toBinaryString(num));

        // Now Update
        // for 1 -> set and for 0 -> clear that bit
        if (flag) {
            System.out.println(Integer.toBinaryString( (~ bitMask) & num ));
        } else {
            System.out.println(Integer.toBinaryString( bitMask | num ));
        }
    }
}