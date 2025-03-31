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

    }
}
