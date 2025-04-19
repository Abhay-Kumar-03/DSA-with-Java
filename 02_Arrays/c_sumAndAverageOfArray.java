public class c_sumAndAverageOfArray {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Sum of your Array is: " + sum);
        System.out.println("Average of your Array is: " + average);
    }

    public static long sum(int[] numArray){
        int index = 0;
        long sum = 0;
        while(index < numArray.length){
            sum += numArray[index];
            index++;
        }
        return sum;
    }

    public static double average(int[] numArray){
        double sum = sum(numArray);
        return  (sum / numArray.length);
    }

}
