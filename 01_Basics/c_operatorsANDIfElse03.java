/*

// Swapping of 2 numbers
import java.util.Scanner;

public class operatorsANDIfElse03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int numFirst = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int numSecond = input.nextInt();
        int num;
        num = numFirst;
        numFirst = numSecond;
        numSecond = num;
        System.out.println("Your First Number is: " + numFirst);
        System.out.println("Your Second Number is: " + numSecond);

    }
}

// Compound interest calculator
import java.util.Scanner;

public class operatorsANDIfElse03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Your Principal Amount: ");
        int Amt = input.nextInt();
        System.out.print("Enter Rate of Interest: ");
        float Rate = input.nextFloat();
        System.out.print("Enter Time Period(in years): ");
        float Time = input.nextFloat();

        double CompoundInterest = Amt * Math.pow((1 + Rate / 100), Time);
        System.out.println("Your Compound Interest is: " + CompoundInterest);

    }
}


// Discount on some basses
import java.util.Scanner;

public class operatorsANDIfElse03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Are You a Female?(true/false): ");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.println("You get 75% Discount");
        } else if (isFemale) {
            System.out.println("You get 50% Discount");
        } else if (age > 60 && !isFemale){
            System.out.println("You get 20% Discount");
        } else{
            System.out.println("You got no Discount");
        }
    }

}


// Greatest from 3 numbers
import java.util.Scanner;

public class operatorsANDIfElse03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is greatest among these three number");
        } else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is greatest among these three number");
        }else{
            System.out.println(num3 + " is greatest among these three number");
        }

    }
}

*/

// Leap Year Program
import java.util.Scanner;

public class c_operatorsANDIfElse03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = input.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.print("Your year is Leap Year");
        } else{
            System.out.print("Your year is not a leap year");
        }
    }
}













