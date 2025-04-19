//public class a_ArrayBasics {
//    public static void main(String[] args) {
////        int[] myArr = new int[5];
////        myArr[0] = 98;
////        myArr[2] = 8;
////        myArr[4] = 9;
////        myArr[1] = 4;
//
//        int[] myArr = {98, 65, 83, 66, 32, 9};
//
////        System.out.println(myArr[0]);
////        System.out.println(myArr[1]);
////        System.out.println(myArr[4]);
//
//        int index = 0;
//        while(index < myArr.length){
//            System.out.println(myArr[index]);
//            index++;
//        }
//
//        String[] stArr = new String[6];
//        stArr[4] = "Abhay";
//
//        String[] myStr = {"ajndh", "khwb", "ehbdi"};
//        System.out.println(myStr.length);
//
//    }
//}


//---------------->>>>> Array Searching
import java.util.Scanner;
public class a_ArrayBasics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {98, 73, 739, 72, 23, 9, 58, 83};
        System.out.print("Enter the Number you want to Search: ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr, num);
        if(isFound){
            System.out.println("Your Number is Present in the Array");
        } else{
            System.out.println("Your Number is not Present in the Array");
        }
    }

    public static boolean isFound(int[] myArr, int num){
        int index = 0;
        while(index < myArr.length){
            if(myArr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}























