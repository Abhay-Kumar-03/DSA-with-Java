// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// leetcode 852

public class Binary_Search_Question_6 {
    public static void main(String[] args) {

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

}
