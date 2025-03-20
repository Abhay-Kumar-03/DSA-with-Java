import java.util.Scanner;

public class j_armstrongNumber10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int count = count(num);
        int arm = armstrongNum(num);
        if(arm == num){
            System.out.println("It is a Armstrong Number");
        } else{
            System.out.println("It is not an Armstrong Number");
        }

    }

    public static int count(int num){
        int count = 0;
        while(num > 0){
            int rem = num%10;
            count++;
            num/=10;
        }
        return count;
    }

    public static int armstrongNum(int num){
        int count = count(num);
        int sum = 0, ans=0, newNum=num, rem;
        while(newNum > 0){
            rem = newNum%10;
            ans += Math.pow(rem,count);
            newNum/= 10;
        }
        return ans;
    }
}
