import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    String aCold = sc.next();
    int aTem = sc.nextInt();
    String bCold = sc.next();
    int bTem = sc.nextInt();
    String cCold = sc.next();
    int cTem = sc.nextInt();

    if(aCold.equals("Y") && aTem >= 37){
        if((bCold.equals("Y") && bTem >= 37) || (cCold.equals("Y") && cTem >= 37))
                System.out.print("E");
        else
                System.out.print("N");
        }
        else {
            if((bCold.equals("Y") && bTem >= 37) && (cCold.equals("Y") && cTem >= 37))
                System.out.print("E");
            else
                System.out.print("N");
        }
    }
}