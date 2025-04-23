// -->> Ceiling of a number (find the number which is smallest number greater than  to target number)

public class Binary_Search_Question_1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of number >= target
    static int ceiling(int[] arr, int target){
        // if target is greater than the greatest number in the array
        if(target > arr[arr.length - 1]) return -1;
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
        return start;
    }

}

