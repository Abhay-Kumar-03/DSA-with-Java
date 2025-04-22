// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class Binary_Search_Question_5 {
    public static void main(String[] args) {
        int[]arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 180, 190, 200, 210, 220, 230};
        int target = 160;
        System.out.println(ans(arr, target));
    }

    static int ans(int[]arr, int target){
        // find the range
        // first start with box of range 2
        int start = 0, end = 1;
        while (target > arr[end]){
            int temp = end + 1; // this this our new start
            // end will be the --> previous end + double the box value
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[]arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

}


