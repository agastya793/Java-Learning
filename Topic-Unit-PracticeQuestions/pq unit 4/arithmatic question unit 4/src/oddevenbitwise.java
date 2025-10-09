import java.util.Scanner;
public class oddevenbitwise {
    public static void main(String[] args) {
        System.out.println("odd even calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("number is odd");
        } else {
            System.out.println("number is even");
        }
    }
}
