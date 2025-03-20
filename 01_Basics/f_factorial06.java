import java.util.Scanner;

public class f_factorial06 {
    public static void main(String[] args) {
        int number = input();
        int fact = fact();
        System.out.println(fact);

    }



    public static int fact(){
        int num = 1;
        int number = input();
        while(number > 0){
            num = num * number;
            number--;
        }
        return num;
    }

    public static int input (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        return num;
    }
}
