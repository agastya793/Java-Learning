import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("new  year calculator");
        System.out.println("enter year you want to check : ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("year is leap year");
        } else if (year % 100 == 0) {
            System.out.println("year is not leap yaer");
        } else if (year % 4==0){
            System.out.println("your year is leap year");
        } else {
            System.out.println("year is not leap year");
        }
    }
}
