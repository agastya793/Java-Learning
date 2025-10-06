import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("greatest of three number");
        System.out.println("enter  your first number : ");
        int num1 = input.nextInt();
        System.out.println("enter  your second number : ");
        int num2 = input.nextInt();
        System.out.println("enter  your third number : ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is greatest");

        } else if ( num2 >=num3) {
            System.out.println("num2 is greatest");

        } else {
            System.out.println("num3 is is greatest");
        }
    }
}
