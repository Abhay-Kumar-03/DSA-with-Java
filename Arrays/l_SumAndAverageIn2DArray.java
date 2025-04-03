import java.util.Scanner;

public class l_SumAndAverageIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] myArr = ArrayUtility.input2DArray();
        int sum = sum(myArr);
        System.out.println("Sum of All elements in your array is: " + sum);
        double average = average(myArr);
        System.out.println("Average of All elements in your array is: " + average);

    }

    public static int sum(int[][] myArr){
        int i = 0;
        int sum = 0;
        while(i < myArr.length){
            int j = 0;
            while(j < myArr.length){
                sum += myArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }


    public static double average(int[][] myArr){
        if(myArr.length == 0) return 0;
        int rows = myArr.length;
        int colms = myArr[0].length;
        return sum(myArr) / (rows * colms);
    }
}
