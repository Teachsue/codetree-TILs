import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cRoom = 0;
        int hallway = 0;
        int restroom = 0;

        for (int day = 1; day <= n; day++) {
            if (day % 12 == 0) {
                restroom++;
            } else if (day % 3 == 0) {
                hallway++;
            } else if (day % 2 == 0) {
                cRoom++;
            }
        }

        System.out.println(cRoom + " " + hallway + " " + restroom);
    }
}