import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((10 <= a && a <= 20 ? "yes" : "no" ));
    }
}