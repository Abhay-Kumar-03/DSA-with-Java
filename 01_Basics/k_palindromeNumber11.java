import java.util.Scanner;
public class k_palindromeNumber11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int answer = palindrome(num);
        if (answer == num) {
            System.out.println("It is a Palindrome Number");
        } else {
            System.out.println("It is not an Palindrome Number");
        }
    }

    public static int palindrome(int num){
        int rem, ans=0, newnum=num;
        while(newnum>0){
            rem = newnum%10;
            ans = ans * 10 + rem;
            newnum /= 10;
        }
        return ans;
    }
}
