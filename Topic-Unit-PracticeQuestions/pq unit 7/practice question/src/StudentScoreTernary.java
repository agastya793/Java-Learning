import java.util.Scanner;
public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to student score");
        System.out.println("enter your marks : ");
        int marks = input.nextInt();
        String category = marks > 80 ? "high" : (marks > 50 ? "moderate" : "low");
        System.out.println("your category is : " + category);
    }
}
