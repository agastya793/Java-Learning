import java.util.Scanner;
public class positivenegativezero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number checker");
        System.out.println("enter your  number : ");
        int num = input.nextInt();

        if(num>0){
            System.out.println("your number is positive");
        } else if (num==0) {
            System.out.println("your number is zero");
        } else {
            System.out.println("your number is negative");
        }
    }
}
