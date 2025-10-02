import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = input.nextInt();
        System.out.println("please enter second number: ");
        int b = input.nextInt();

        System.out.println( " multiplication : " + a*b);
        System.out.println(" addition : " + a+b);
        System.out.println("subtraction: " +  (a-b));
        System.out.println("division : " + a/b);
        System.out.println("modulus:" + a%b);

    }
}
