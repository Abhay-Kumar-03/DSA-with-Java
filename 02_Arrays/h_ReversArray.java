import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class h_ReversArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int index = 0;
        while(index < arr.length){
            System.out.print("Enter element number " + (index+1) + ": ");
            arr[index] = input.nextInt();
            index++;
        }
        reverseArray(arr);
//        System.out.println("Your Reverse Array is here!");
//        ArrayUtility.displayArray(arr);
    }

    public static void reverseArray(int[] arr){
        int i = 0;
        int left = i , right = arr.length - 1;
        while(i < arr.length / 2){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            i++;
            left++;
            right--;
        }

        System.out.println("Your Reverse Array is here!");
        int index = 0;
        while(index < arr.length){
            System.out.print(arr[index] + " ");
            index++;
        }
    }
}
