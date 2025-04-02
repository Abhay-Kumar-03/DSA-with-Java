import java.util.Scanner;

public class g_DeleteElementAndCreatingNewArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of your array: ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        int index = 0;
        while(index < size){
            System.out.print("Enter element number" + (index+1) +" :");
            myArr[index] = input.nextInt();
            index++;
        }
        System.out.print("Enter that element which you want to delete from this array: ");
        int num = input.nextInt();
        int occur = occur(myArr, num);
        System.out.print(occur);
        int[] newArray = new int[size - occur];
        System.out.println(newArray);

    }

    public static int occur(int[] myArr,  int num){
        int count = 0;
        int index = 0;
        while(index < myArr.length){
            if(myArr[index] == num){
                count++;
            }
            index++;
        }
        return count;
    }

    public static int[] newArray(int[] myArr , int num){
        int count = occur(myArr, num);

    }

}