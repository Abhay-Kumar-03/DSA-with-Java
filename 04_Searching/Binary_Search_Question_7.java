// https://leetcode.com/problems/find-in-mountain-array/description/
// leetcode 1095

public class Binary_Search_Question_7 {

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) return firstTry;

        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // this means we are at the dece part of the array
                // this may be the answer but we also check at the left side of array
                // this is why end != mid-1
                end = mid;
            }else{
                // you are at the ass part of the array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // int the end start == end ans pointing at the greatest elemnet in the array because of the above 2 checks
        // start and end both are trying to find max element in array
        // ans hence when they both pointing at the same number i.e our max number
        return start; // or return end both will give same answer
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        // to find array is ascending or not
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // to find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > mid) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
