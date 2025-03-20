import java.util.Scanner;

public class g_LCM07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int first = input.nextInt();
        System.out.print("Enter your second number: ");
        int second = input.nextInt();
        int ans = lcmCal(first, second);
        System.out.println("LCM is: " + ans);
    }

    public static int lcmCal(int first, int second){
        int i = 1;
//        while(i<=second){
        while(true){
            int ans = first * i;
            if(ans % second == 0){
                return ans;
            }
            i++;
        }
//        return 0; // unreachable
    }
}
