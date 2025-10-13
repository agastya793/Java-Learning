import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]arr = {3,6,8,87,65,20,34,32,12,45,76};
        System.out.println("welcome to array searching");
        System.out.println("enter number you want to search : ");
        int num = input.nextInt();
        boolean isFound = isFound(arr , num);
        if (isFound) {
            System.out.println("your number was found");
        } else {
            System.out.println("your number not found");
        }
    }
    public static boolean isFound(int[] arr , int num) {
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num ){
                return true;
            }
            index++;
        }
        return false;
    }
}
