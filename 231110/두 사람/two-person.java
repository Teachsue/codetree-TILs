import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aAge = sc.nextInt();
        String aGen = sc.next();
        int bAge = sc.nextInt();
        String bGen = sc.next();

        if ((aAge >= 19 && aGen.equals("M")) || (bAge >= 19 && bGen.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}