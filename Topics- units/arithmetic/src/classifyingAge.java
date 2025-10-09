import java.util.Scanner;
public class classifyingAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Age classifier");
        System.out.println(" enter your age ");
        int age = input.nextInt();
         if (age >= 65) {
             System.out.println(" you are senior citizen");
         }
         else if (age>=20) {
             System.out.println(" yor are adult");
         }
         else if ( age >= 13) {
             System.out.println("you are a teenager");
         }
         else {
             System.out.println("you are child");

    }
}
}
