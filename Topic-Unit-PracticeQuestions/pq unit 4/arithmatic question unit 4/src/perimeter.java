import java.sql.SQLOutput;
import java.util.Scanner;
public class perimeter {
    public static void main(String[] args) {
        int a = 4;
      int  b = 3;
       int c = 5;
       int d = 6;
        System.out.println("perimeter of rectangle: " + (a+b+c+d));

        // taking input from user
        System.out.println("taking input from user");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int z = input.nextInt();
        int v = input.nextInt();
        int e = input.nextInt();
        System.out.println("enter all four sides");
        System.out.println("perimeter:" + (x+z+v+e));

    }
}
