import java.util.HashSet;

public class Recursion2 {


    // Tower of Hanoi
    static long count = 0;
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        count += 1;
        if (n==1) {
            // System.out.println("transfer disk "+ n +" from "+ src +" to "+dest);
            return ;
        }
        towerOfHanoi(n-1, src, dest, helper);  
        // System.out.println("transfer disk "+ n +" from "+ src +" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }


    // Reverse String
    public static void printRev(String str, int idx){
        if (idx == 0){
            return;
        }
        System.out.print(str.charAt(idx-1));
        printRev(str, idx-1);
    }


    // Strictly Increasing / Check Sorted Array
    public static boolean isSorted(int[] arr, int idx){
        
        if (idx == arr.length-1){
            return true;
        }

        if (arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }



    // Remove Duplicate char from String
    public static boolean[] charArray = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        int pos = currChar - 'a';

        if (!charArray[pos]){
            newStr += currChar;
            charArray[pos] = true;
        }
        removeDuplicate(str, idx+1, newStr);
        
    }

    // Subsequences from the String
    public static void subSequences(String str, int idx, String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        // char to be Added 
        subSequences(str, idx+1, newStr+currChar);

        // char not to be Added
        subSequences(str, idx+1, newStr);
    }


    // Unique Subsequences from the String
    public static void uniqueSubSequences(String str, int idx, String newStr, HashSet<String> set){
        if (idx == str.length()){
            if (!set.contains(newStr)) {    //If newStr not present in set 
                System.out.println(newStr);
                set.add(newStr);
            }
            return;
        }
    
        char currChar = str.charAt(idx);

        // char to be Added 
        uniqueSubSequences(str, idx+1, newStr+currChar, set);

        // char not to be Added
        uniqueSubSequences(str, idx+1, newStr, set);
    }


    // Keypad Combinations
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String comb){
        if (idx == str.length()){
            System.out.println(comb);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i< mapping.length(); i++){
            printComb(str, idx+1, comb+mapping.charAt(i));
        }
    }





    public static void main(String args[]){

        // Tower of Hanoi
        int n = 3;
        // towerOfHanoi(n, "S", "H", "D");
        // System.out.println("For "+n+" disks, Steps Required: "+count);


        // Reverse String
        String str = "Harsh";
        // printRev(str, str.length());


        // Check the Array is Sorted (Strictly Increasing)
        int[] arr = {1,2,3,4,4};
        // System.out.println(isSorted(arr, 0));


        // Remove Duplicate char from String
        String str2 = "aabcddae";
        // removeDuplicate(str2, 0, "");


        // Print the Subsequences of the String
        // subSequences("abc", 0, "");


        // Print the unique Subsequences of the String
        HashSet<String> set = new HashSet<>();
        // uniqueSubSequences("aaa", 0, "", set);
        // uniqueSubSequences("abc", 0, "", set);


        // Keypad Combination
        printComb("78", 0, "");





        
    }

}