import java.util.Scanner;

public class i_fibonacciSeries09 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        int a = 0, b = 1;
        int sum = 0;
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        while(a + b <= num){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;

        }
    }
}
