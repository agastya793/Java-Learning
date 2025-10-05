import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("si calculator");
        System.out.println("enter principle amount ");
        int principle = input.nextInt();
        System.out.println("enter rate of interest");
        float rate = input.nextFloat();
        System.out.println("number of years");
        int years = input.nextInt();
        float interest = (principle * rate * years) / 100;
        System.out.println(" calculated simple interest : " + interest);
    }
}
