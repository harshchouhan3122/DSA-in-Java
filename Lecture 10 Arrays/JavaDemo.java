import java.util.*;

class JavaDemo{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter the dimensionas of the 2D Array: ");
        // int row = scan.nextInt();
        // int col = scan.nextInt();

        // int[][] array = new int[row][col];

        // // Take i/p elements
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         array[i][j] = scan.nextInt();
        //     }
        // }
        // int[] array = {1,2,3,4};
        int[] array = {5,4,3,2,1};
        // int[] array = {4,3,5,1};
        
        // Sort the Array
        int[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);

        // Reversed Sort the Array
        int[] reverseArray = array.clone();
        Arrays.sort(reverseArray);
        Collections.reverse(Arrays.asList(reverseArray));
    
        System.out.println(Arrays.toString(reverseArray));

        // is Sorted Array??
        // if ( arrayCopy == array){        //it check the same objects
        if (Arrays.equals(array, arrayCopy) || (Arrays.equals(array, reverseArray) ) ){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


        // Print the 2D Array
        // for(int i=0; i<array.length; i++){
        //     for(int j=0; j<array[i].length; j++){
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}