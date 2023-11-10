import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gen = sc.nextInt();
        int age = sc.nextInt();

        if (age >= 19) {
            if (gen == 0) {
                System.out.println("MAN");
            } else {
                System.out.println("WOMAN");
            }
        } else {
            if (gen == 0) {
                System.out.println("BOY");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}