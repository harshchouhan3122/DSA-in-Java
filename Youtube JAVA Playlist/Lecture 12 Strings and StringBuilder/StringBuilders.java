import java.util.*;


public class StringBuilders {
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("Harsh Chouhan");

        // Search
        System.out.println(sb.charAt(2));

        // Replace Character
        sb.setCharAt(6,'c');
        System.out.println(sb);
        
        // Insert 
        sb.insert(5,"-");
        System.out.println(sb);

        // Delete 
        sb.delete(6,7);
        System.out.println(sb);

        // Append  
        sb.append("3122");
        System.out.println(sb);

    }
}
