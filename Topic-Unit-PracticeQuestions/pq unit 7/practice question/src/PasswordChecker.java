import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.println("enter your password: ");
             password =input.next();
        } while (!isValidPassword(password));


    }
    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
