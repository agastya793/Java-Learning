import java.util.Scanner;
public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("driving license portal");
        System.out.println("enter your age : ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("eligible for driving");
        }
        else {
            System.out.println("not eligible ");
        }
    }
}
