import java.util.Scanner;
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing bitwise and operator");
        System.out.println(" enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();

        int result = first & second;
        System.out.println(" Result is   : " +  result);
    }
}
