import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a, Math.min(b, c));

        System.out.print((a < b && b <= c) ? 1 : 0);
        System.out.print(" ");
        System.out.print((a == b && b == c) ? 1 : 0);
    }
}