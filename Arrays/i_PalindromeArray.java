import java.util.Scanner;

public class i_PalindromeArray {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        boolean isPalind = isPalindrome(myArr);
        if(isPalind) System.out.println("Your Array is Palindrome");
        else System.out.println("Your Array is not Palindrome");
    }

    public static boolean isPalindrome(int[] myArr){
        int i = 0, left = 0, right = myArr.length -1;
        while(i < myArr.length){
            if(myArr[left] != myArr[right]) return false;
            i++;
            left++;
            right--;
        }
        return true;
    }
}
