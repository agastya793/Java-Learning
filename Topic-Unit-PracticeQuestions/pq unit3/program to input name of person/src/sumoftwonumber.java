import java.util.Scanner;

public class sumoftwonumber {
    public static void main(String[] args) {
        System.out.println("enter first number = ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.println("enter second number = ");
        Scanner input2 = new Scanner(System.in);
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("sum are " + sum);

    }

}
