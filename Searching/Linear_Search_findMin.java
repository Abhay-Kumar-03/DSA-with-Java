public class Linear_Search_findMin {
    public static void main(String[] args) {
        int[] arr = {7, 884, 45, 3, 78, 90};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr){
        int ans = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
