/*
import java.util.Scanner;
public class inputPrograms02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning! " + name);

        System.out.print(name + " , Also tell me your age: ");
        int age = input.nextInt();
        System.out.println("Age of " + name + " is " + age);
    }
}


import java.util.Scanner;

public class inputPrograms02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " for learning DSA with Java!");
    }
}

*/

import java.util.Scanner;

public class b_inputPrograms02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int Num2 = input.nextInt();
        int Sum ;
        Sum = Num1 + Num2;
        System.out.println("Sum of your given numbers is: " + Sum);

    }
}