import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                a++;
            }
            if (num % 5 == 0) {
                b++;
            }
        }

        System.out.println(a + " " + b);
    }
}