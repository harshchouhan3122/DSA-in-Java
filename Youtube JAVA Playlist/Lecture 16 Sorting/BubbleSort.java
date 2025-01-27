import java.util.*;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {7,8,3,1,2,5};

        // Bubble Sort
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
