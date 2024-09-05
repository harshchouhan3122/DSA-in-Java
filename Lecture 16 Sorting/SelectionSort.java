import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] arr = {7,8,3,1,2,5};
        System.out.println(Arrays.toString(arr));

        // Selection Sort
        int n = arr.length;

        for(int i=0; i <n-1; i++){
            int smallest = i;
            for(int j=i; j<n; j++){
                if (arr[j] <= arr[smallest]){
                    smallest = j;
                }
            }
            // Single Swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            System.out.println(Arrays.toString(arr));
        }
        

        System.out.println(Arrays.toString(arr));
    }
}
