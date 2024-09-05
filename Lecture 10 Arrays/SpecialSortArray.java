import java.util.*;

class SpecialSortArray{

    public static void main(String args[]){

        // String[] array = {"Harsh", "Rama", "Imagine"};
        String[] array = {"aaaaaz", "baaap", "cImaginey"};
        // System.out.println(Arrays.toString(array));

        // Reverse Sort the Array according to the last alphabet of the word
        // {"Harsh", "Imagine", "Rama"};

        Arrays.sort(array);         //Sorted array according to the first alphabet of the word
        // System.out.println(Arrays.toString(array));      //[Harsh, Imagine, Rama]
       
        // System.out.println(array[array.length-1]);                     //Last element of the array
        // System.out.println(array[1].charAt(array[1].length()-1));      //Last alphabet of the word at index 1

        // // Sort the array based on the last character of each string
        // Arrays.sort(array, new Comparator<String>() {
        //     @Override
        //     public int compare(String s1, String s2) {
        //         // Compare the last characters of the two strings
        //         char lastChar1 = s1.charAt(s1.length() - 1);
        //         char lastChar2 = s2.charAt(s2.length() - 1);
        //         return Character.compare(lastChar1, lastChar2);
        //     }
        // });

        // Sort Array According to the last alphabet of the word
        for(int i=0; i<array.length; i++){
            int swap=i;

            for(int j=i+1; j<array.length; j++){
                if ( (array[j].charAt(array[j].length()-1)) > (array[i].charAt(array[i].length()-1)) ){
                    swap = j;
                }
            }

            String temp = array[i];
            array[i] = array[swap];
            array[swap] = temp;
        }

        // Print the Array
        System.out.println(Arrays.toString(array));

    }
}