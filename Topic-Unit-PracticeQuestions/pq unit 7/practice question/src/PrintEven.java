import java.util.Scanner;
public class PrintEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
            if (i % 2==1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
