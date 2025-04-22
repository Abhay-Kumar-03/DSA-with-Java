import java.lang.reflect.Array;
import java.util.Arrays;

public class Linear_Search_In_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {67, 83, 9, 3},
                {87, 34, 52, 4, 76},
                {32, 56, 2}
        };
        int target = 76;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int [] {i+1, j+1};
                }
            }
        }
        return new int [] {-1, -1};
    }

}
