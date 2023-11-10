import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int emergencyCount = 0;

        for (int i = 0; i < 3; i++) {
            String symptom = sc.next();
            int temperature = sc.nextInt();

            if ("Y".equals(symptom) && temperature >= 37) {
                emergencyCount++;
            }
        }

        if (emergencyCount >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}