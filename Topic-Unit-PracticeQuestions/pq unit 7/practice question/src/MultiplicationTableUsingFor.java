import java.util.Scanner;
public class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to printing tables");
        System.out.println("enter your number to print table: ");
        int num = input.nextInt();

        for (int i = 1;i <= 100; i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}
