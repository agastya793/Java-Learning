import java.util.Scanner;
public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("welcome to array sorting");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArr);
        boolean isDec = isDecreasing(numArr);
        if (isInc || isDec) {
            System.out.println("your array is sorted");
        } else{
            System.out.println("your array is not sorted");
        }

    }


    public static boolean isIncreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] < numArr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] numArr) {
        int i = 1;
        while (i < numArr.length) {
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
