import java.util.Scanner;
public class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd or even");
        System.out.println("enter your number : ");
        int num = input.nextInt();
        String result = num % 2 ==0 ? "even" : "odd";
        System.out.println("your number is : " + result);
    }
}
