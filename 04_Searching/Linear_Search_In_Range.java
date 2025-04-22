public class Linear_Search_In_Range {
    public static void main(String[] args) {
        int[] arr = {1, 43, 98, 87, 14, 32};
        int numToFind = 14;
        int range = 4;
        linearSearch(arr, numToFind, range);
    }

    static int  linearSearch(int[] arr , int numToFind, int range){
        int i = 0;
        if(arr.length == 0) return -1;
        while(i < range){
            if(arr[i] == numToFind){
                System.out.println("We found your number in this array at index number " + i );
            } else {
                System.out.println("We did not find your number in your range");
            }
            i++;
        }
        return -1;
    }

}
