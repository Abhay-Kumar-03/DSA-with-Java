import java.util.Scanner;

public class d_numberOfOccurrence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int size = input.nextInt();
        int[] myArr = new int [size];
        int index = 0;
        while(index < size){
            System.out.print("Enter element number " + (index+1) + ": ");
            myArr[index] = input.nextInt();
            index++;
        }
        System.out.print("Enter the element who's occurrence you want to check: ");
        int num = input.nextInt();
        int occur = occur(myArr, num);
        System.out.println("Occurrence of Your given number in Array is: " +occur+ " times");

    }

    public static int occur(int[] myArr, int num){
        int count = 0, index = 0;
        while(index < myArr.length){
            if(myArr[index] == num){
                count++;
            }
            index++;
        }
        return count;
    }

}
