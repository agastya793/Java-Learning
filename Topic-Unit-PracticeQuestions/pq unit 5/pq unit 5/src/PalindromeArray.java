
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPalindrome(arr))
            System.out.println("The array is a palindrome.");
        else
            System.out.println("The array is not a palindrome.");

        sc.close();
    }

    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right])
                return false;
            left++;
            right--;
        }

        return true;
    }
}

