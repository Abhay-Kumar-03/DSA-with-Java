//--->>>   https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//--->>>   Leetcode Question 1295


public class Linear_Search_Question {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(digits(0));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numOfDigits = digits(num);

        return numOfDigits % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0) return 1;
        int count = 0 ;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

}




