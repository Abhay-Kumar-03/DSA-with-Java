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
//        System.out.print(occur);
        newArray(myArr, num);


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

    public static void newArray(int[] myArr , int num){
        int count = occur(myArr, num);
        if(count == 0)
            System.out.println(myArr);
        int newSize = myArr.length - count;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while(i < myArr.length){
            if(myArr[i] != num){
                newArr[j] = myArr[i];
                j++;
            }
            i++;
        }

        int index = 0;
        while(index < newArr.length){
            System.out.print(newArr[index]);
            index++;
        }
    }

}