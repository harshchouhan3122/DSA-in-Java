import java.util.Scanner;

class TwodimensionalArray{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dimensionas of the 2D Array: ");
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] array = new int[row][col];

        // Take i/p elements
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = scan.nextInt();
            }
        }
        
        // Search for the Element
        System.out.print("Enter the key(searching element): ");
        int target = scan.nextInt();
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if (array[i][j] == target) {
                    System.out.println("Position: "+i+","+j);
                    break;
                }
            }
        }

        // Print the 2D Array
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}