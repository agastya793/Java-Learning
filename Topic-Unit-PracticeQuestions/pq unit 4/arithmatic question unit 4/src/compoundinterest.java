
import java.util.Scanner;
public class compoundinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("compound interest calculator");
        System.out.println("enter principle amount ");
        int principle = input.nextInt();
        System.out.println("enter rate of interest");
        float rate = input.nextFloat();
        System.out.println("number of years");
        float years = input.nextFloat();

        double compint = principle + Math.pow((1 + rate / 100),  years);
        System.out.println("compound interest : " + compint);


    }
}
