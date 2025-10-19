public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Factorial of " + n + " = " + result);
    }

    // Recursive method
    public static int factorial(int n) {
        if (n == 0 || n == 1)  // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }
}

