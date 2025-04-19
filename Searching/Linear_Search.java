//---->>> Find whether 14 exists in array or not
public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1, 43, 98, 14, 32};
        int numToFind = 14;
        linearSearch(arr, numToFind);
    }

    static int  linearSearch(int[] arr , int numToFind){
        int i = 0;
        if(arr.length == 0) return -1;
        while(i < arr.length){
            if(arr[i] == numToFind) {
                System.out.println("We found your number in this array at index number " + i );
            }
            i++;
        }
        return -1;
    }

}
