import java.util.Scanner;

public class j_Merge2SortedArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = mergeArrays(arr1, arr2);
        System.out.println("Your Merged Array is here");
        ArrayUtility.displayArray(mergedArr);
        
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length || i < arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            } else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
