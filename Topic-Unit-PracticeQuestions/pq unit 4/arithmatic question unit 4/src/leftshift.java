import java.util.Scanner;
public class leftshift {
    public static void main(String[] args) {
        System.out.println("implementing left shift");
        Scanner input = new Scanner (System.in);
        System.out.println("enter number");
        int num = input.nextInt();

         int result =  num<< 1;
        System.out.println(" result : " + result);
    }
}
