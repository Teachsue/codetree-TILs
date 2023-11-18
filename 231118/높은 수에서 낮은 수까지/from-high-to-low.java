import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int first, end;

        if (a > b) {
            first = a;
            end = b;
        } else {
            first = b;
            end = a;
        }

        for (int i = first; i >= end; i--) {
            System.out.print(i + " ");
        }
    }
}