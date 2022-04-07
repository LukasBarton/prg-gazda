import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int R = 0;
        int P = 1;
        int S = 2;
        Scanner myScan = new Scanner(System.in);
        Random myRand = new Random();
        int hScore = 0;
        int kScore  = 0;
        while (true) {
            System.out.println("0. kamen");
            System.out.println("1. papir");
            System.out.println("2. nuzky");

            int h = myScan.nextInt();

            int k = myRand.nextInt(3);

            if (h == k) {
                System.out.println("remiza!");
            } else if (h == R && k == S || h == S && k == P || h == P && k == R) {
                System.out.println("hrac win!");
                hScore++;

            } else if (h == S && k == R || h == P && k == S || h == R && k == P) {
                System.out.println("komp win!");
                kScore++;
            }

            System.out.println("h = " + hScore + " k = " + kScore);

        }
    }
}
