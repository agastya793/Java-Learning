import java.util.Scanner;

import static javax.swing.Spring.height;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to area calculator\n");
        System.out.print("enter your base in cm :  ");
        double base = input.nextDouble();
        System.out.print("perpendicular in cm : ");
        double height = input.nextDouble();

        double area =  (base * height)/2;

        System.out.println("area of triangle is: "  + area );




    }
}
