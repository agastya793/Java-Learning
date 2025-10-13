import java.util.Scanner;
public class ArraySumAverage {
    public static void main(String[] args){
        System.out.println("welcome to array sum and average");
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("sum of the numbers is : " + sum);
        System.out.println("average of number is : " + avg);
    }
    public static long sum(int[] numArray){
        long sum = 0;
        int i = 0;
        while(i< numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static int average(int[] numArray)  {
        long sum = sum(numArray);
        return (int) (sum / numArray.length);

    }
}
