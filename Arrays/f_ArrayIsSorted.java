import java.util.Scanner;

public class f_ArrayIsSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        int index = 0;
        while(index < size){
            System.out.print("Enter element number " + (index+1) + ": ");
            myArr[index] = input.nextInt();
            index++;
        }
        boolean isIncreasing = isIncreasing(myArr);
        boolean isDecreasing = isDecreasing(myArr);
        if(isIncreasing || isDecreasing){
            System.out.print("Your Array is Sorted");
        } else{
            System.out.println("Your Array is not Sorted");
        }

    }

    public static boolean isIncreasing(int[] myArr){
        int i = 0;
        while(i < myArr.length-1){
            if(myArr[i] > myArr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] myArr){
        int i = 0;
        while(i < myArr.length-1){
            if(myArr[i] < myArr[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

}
