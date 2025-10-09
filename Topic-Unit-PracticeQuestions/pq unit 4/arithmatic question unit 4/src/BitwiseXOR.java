import java.util.Scanner;
public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bitwise XOR implementation");
        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("result is : " + result);
    }
}
