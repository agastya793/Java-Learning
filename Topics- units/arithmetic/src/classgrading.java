import java.util.Scanner;
public class classgrading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grade Calculator");
        System.out.println("enter your percentage");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("you have got A");
        } else if (percentage >= 75) {
            System.out.println("you have got B");

        } else if (percentage >= 60) {
            System.out.println("you  have got C");
        } else if (percentage >= 45) {
            System.out.println(" you have got D");
        } else {
            System.out.println(" you are fail");

        }
    }
}