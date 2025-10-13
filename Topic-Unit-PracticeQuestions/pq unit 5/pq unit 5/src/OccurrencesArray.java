import java.util.Scanner;
public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array occurrences");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("enter number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArr , num);
        System.out.println("");

    }
    public static int noOfOccurrences(int[] numArr , int num){
        return 0;
    }


}
