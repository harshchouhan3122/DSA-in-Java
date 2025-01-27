import java.util.*;


class ReverseString{

    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("Harsh Chouhan");

        // Reverse the String using StringBuilder functions
        int front = 0; int back = sb.length()-1;

        while(front < back){
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

            front++; back--;
        }

        System.out.println(sb);
    }
}