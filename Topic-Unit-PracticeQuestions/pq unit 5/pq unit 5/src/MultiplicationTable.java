import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("multiplication world");
        System.out.println("enter number : ");
        int num = Scanner.nextInt();
        printMultiplicationTable(num);

    }
    public static void printMultiplicationTable(int num){
int i = 1;
while (i<= 10){
    System.out.println(num +" X" + i + "="+ (num * i));
    i++;
}
    }

}
