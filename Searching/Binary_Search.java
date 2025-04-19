public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-8, -5, -2, 0, 3, 4, 7, 18, 24, 56};
        int target = 24;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return indx
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // to find the middle element
            int mid = start + (end - start) / 2;
            if(target < mid){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

}
