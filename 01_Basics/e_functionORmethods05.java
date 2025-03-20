import java.util.Scanner;

////------->> Function OR Method
//public class functionORmethods05 {
//    public static void main(String[] args) {
//        System.out.println("In main method---");
//        greatUser();
//        System.out.println("In function---");
//        greatUser();
//    }
//
//    public static void greatUser() {
//        System.out.println("Good Morning from Abhay!");
//    }
//}


//-------->> Return method
public class e_functionORmethods05 {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.print("Sum of given numbers is: " + sum);

    }

    public static void greet(){
        System.out.println("Welcome to Calculator!");
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }
}