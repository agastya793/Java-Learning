import java.util.Scanner;
public class floatmultiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("float multiplication\n");
        System.out.println("enter first decimal number: ");
        double a = input.nextDouble();
        System.out.println("enter second number: ");
        double b = input.nextDouble();
        System.out.println("addition: " + (a+b));
        System.out.println("subtraction:" + (a-b));
        System.out.println("multiplication: " + a*b);
        System.out.println("division: " + a/b);
        System.out.println("modulus: " + a%b);
    }

}
