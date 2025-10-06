import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("odd even calculator");
        System.out.println(" enter your number : ");
        int num = input.nextInt();

        if(num% 2 == 0) {
            System.out.println("your number is even");

        }else {
            System.out.println("your number is odd");
        }
    }
}
