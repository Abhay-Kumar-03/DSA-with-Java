import java.util.Scanner;

public class e_MAXandMINofArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your Array: ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        int index = 0;
        while(index < size){
            System.out.print("Enter element number " + (index + 1) +": ");
            myArr[index] = input.nextInt();
            index++;
        }
        int max = max(myArr);
        int min = min(myArr);
        System.out.println("Maximum Number of Your Array is: " + max);
        System.out.println("Minimum Number of Your Array is: " + min);
    }

    public static int max(int[] myArr){
        //return
        int max = myArr[0];
        int index = 0;
        while(index < myArr.length){
            if(myArr[index] > max){
                max = myArr[index];
            }
            index++;
        }
        return max;
    }

    public static int min(int[] myArr){
        int min = myArr[0];
        int index = 0;
        while(index < myArr.length){
            if(myArr[index] < min){
                min = myArr[index];
            }
            index++;
        }
        return min;
    }

}
