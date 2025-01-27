import java.util.*;


public class Recursion3 {

    // Print Permutaions of String
    public static void printPerm(String str, String permutation){

        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i< str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }

    // Total paths in a maze from (0,0) to (n,m)
    public static int countPaths(int i, int j, int n, int m){

        if (i == n || j == m){      // exit
            return 0;
        }

        if ( i== n-1 && j == m-1){  // last column and last row cell has only single path 
            return 1;
        }

        // DownPaths
        int downPaths = countPaths(i+1, j, n, m);

        // RightPaths
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths+rightPaths ;
    }


    // Ways to Place 1Xm size tile on nXm sized floor.
    public static int placeTiles(int n, int m){

        if (n == m){
            return 2;
        }

        if ( n < m){
            return 1;
        }

        int verticalPlacements = placeTiles(n-m, m);
        int horizontalPlacements = placeTiles(n-1, m);

        return verticalPlacements + horizontalPlacements ;
    }

    // Print all the ways to call n guests (you can invite them Single or in pair)
    public static int callGuests(int n){
        if (n <= 1){
            return 1;
        }

        // Single 
        int way1 = callGuests(n-1);

        // in Pair
        int way2 = (n-1) * callGuests(n-2);

        return (way1 + way2);
    }

    // Print all the subsets of a set of first n natural numbers

    // To Print the ArrayList
    public static void printSubset(ArrayList<Integer> subset){
        for (int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }

    // To find Possible Subsets
    public static void findSubsets(int n, ArrayList<Integer> subset){

        if (n == 0){
            printSubset(subset);
            return ;
        }
        
        // Add 
        subset.add(n);
        findSubsets(n-1, subset);

        // Not Add
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }


    public static void main(String args[]){

        // Print all possible Permuatation of given String
        // printPerm("abc", "");
        
        // Total paths in a maze from (0,0) to (n,m)
        int n = 3; int m = 3;
        // System.out.println("2. There are "+countPaths(0,0,n,m)+" no. of paths to move from (0,0) to ("+n+","+m+").");

        // Ways to Place 1Xm size tile on nXm sized floor.
        n = 5; m = 5;
        n = 4; m = 2 ;
        // System.out.println("3. You can cover " +n+"X"+m+" size floor by 1X"+m+" size tile in "+ placeTiles(n,m) +" ways.");

        // Print all the ways to call n guests (you can invite them Single or in pair)
        n = 4;
        // System.out.println("4. You can Call "+n+" persons in "+callGuests(n)+" ways.");


        // Print all the subsets of a set of first n natural numbers
        n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);


    } 

}