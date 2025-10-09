import java.util.Scanner;
public class bitwisecomplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" not/ complement of number");
        System.out.println("enter your number");
        int number = input.nextInt();

        int result = ~number;

        System.out.println("result : " + result);

    }
}
