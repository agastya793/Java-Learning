import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculator");
        System.out.println("enter first number : ");
        int num1 = input.nextInt();
        System.out.println("enter second number : ");
        int num2 = input.nextInt();
        System.out.println("enter operation");
        String operation = input.next();

        int result = switch(operation ) {
            case "+" -> num1 +  num2;
            case "-" -> num1 -  num2;
            case "*" -> num1 *  num2;
            case "/" -> num1 /  num2;
            default -> -1;


        };
        System.out.println("your answer is : " + result);
    }
}
