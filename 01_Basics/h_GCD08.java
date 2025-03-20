import java.util.Scanner;

public class h_GCD08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Please enter second number: ");
        int second = input.nextInt();
        int ans = gcd(first, second);
        System.out.println("GCD is: " + ans);

    }

    public static int gcd(int first, int second){
        int i = 2;
        while(i<=second){
            if((first % i == 0) && (second % i == 0)){
                return i;
            }
            i++;
        }
        return 0;
    }
}
