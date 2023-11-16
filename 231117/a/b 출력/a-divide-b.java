import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int precision = 20;
        int result = a / b;
        System.out.print(result + ".");

        for (int i = 0; i < precision; i++) {
            a = (a % b) * 10;
            result = a / b;
            System.out.print(result);
        }

        System.out.println();
    }
}