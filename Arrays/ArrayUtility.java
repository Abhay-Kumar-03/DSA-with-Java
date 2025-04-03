import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int size = input.nextInt();
        int[] nums = new int [size];
        int i = 0;
        while(i < size){
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }



    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in Array: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of column in Array: ");
        int columns = input.nextInt();
        int[][] myArr = new int [rows][columns];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns){
                System.out.print("Please enter element row " + (i+1) + " and " + " column: " + (j+1) +" : ");
                myArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return myArr;
    }
}










