
import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Clean the string: remove spaces and make lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");

        sc.close();
    }

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start crosses end, it's a palindrome
        if (start >= end)
            return true;

        // If mismatch found, it's not a palindrome
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }
}
