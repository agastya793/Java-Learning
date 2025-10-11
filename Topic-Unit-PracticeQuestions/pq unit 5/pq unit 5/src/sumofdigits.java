import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sum of  digits");
        System.out.println("enter your number: ");
        int num = input.nextInt();
        int sum = sumofdigits(num);
        System.out.println("sum of digit is : "+ sum);
    }
    public static int sumofdigits(int num){
        int sum = 0;
        while ( num>0){
            sum = sum +( num % 10);
            num = num / 10;

        }
        return sum;

    }

}
