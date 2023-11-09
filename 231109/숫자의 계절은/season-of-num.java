import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        String season = (m >= 3 && m <= 5) ? "Spring" :
                        (m >= 6 && m <= 8) ? "Summer" :
                        (m >= 9 && m <= 11) ? "Fall" : "Winter";

        System.out.println(season);
    }
}