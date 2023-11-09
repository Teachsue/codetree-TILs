import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int finals = sc.nextInt();
        int money = (mid >= 90 && finals >= 95) ? 100000 :
                    (mid >= 90 && finals <= 90) ? 50000 : 0;
                        
        System.out.println(money);
    }
}