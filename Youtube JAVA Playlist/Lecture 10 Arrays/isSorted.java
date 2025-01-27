import java.util.*;

class isSorted{

    public static int[] reverse(int[] arr){
        int left=0; int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        return arr;
    }

    public static void main(String args[]){

        // int[] array = {1,2,3,4};
        // int[] array = {5,4,3,2,1};
        int[] array = {4,3,5,1};
        
        // Sort the Array
        int[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);


        // Reversed Sort the Array
        int[] arrayCopy2 = array.clone();
        Arrays.sort(arrayCopy2);
        
        // Collections.reverse(Arrays.asList(arrayCopy2));
        reverse(arrayCopy2);
        System.out.println(Arrays.toString(arrayCopy2));

        if (Arrays.equals(array, arrayCopy) || (Arrays.equals(array, arrayCopy2) ) ){     // if ( arrayCopy == array){        //it check the same objects
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
}