import java.util.Scanner;
public class k_Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] myArr = ArrayUtility.input2DArray();
        System.out.print("Enter number you want to search : ");
        int num = input.nextInt();
        boolean isFound = search(myArr, num);
        if(isFound) System.out.println("Your Number is found in the Array");
        else System.out.println("Your Number is not found in Array");

    }

    public static boolean search(int[][] myArr, int  num){
        int i = 0;
        while(i < myArr.length){
            int j = 0;
            while(j < myArr.length){
                if(myArr[i][j] == num) return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
