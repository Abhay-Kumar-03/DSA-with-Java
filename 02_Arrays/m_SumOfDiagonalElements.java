import java.util.Scanner;
public class m_SumOfDiagonalElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Equal Number of Rows And Columns for this problem");
        int[][] myArr = ArrayUtility.input2DArray();
        long sum = sum(myArr);
        System.out.println("Sum of your diagonal elements is: " + sum);
    }

    public static long sum(int[][] myArr) {
        long sumleft = sumLeft(myArr);
        long sumright = sumRight(myArr);
        long sum = sumLeft(myArr) + sumRight(myArr);
        if(myArr.length % 2 != 0){
            int index = myArr.length / 2;
            sum -= myArr[index][index];
        }
        return sum;
    }

    public static long sumLeft(int[][] myArr) {
        long sum = 0;
        int i = 0;
        while(i < myArr.length){
            sum += myArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumRight(int[][] myArr) {
        long sum = 0;
        int i = 0;
        while(i < myArr.length){
           int col = myArr.length - 1 - i;
           sum += myArr[i][col];
           i++;
        }
        return sum;
    }
}
