import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
        public static void main(String[] args) {
                int R = 0;
                int P = 1;
                int S = 2;
                int h;
                int k;
                Scanner myScan = new Scanner(System.in);
                Random myRand = new Random();
                System.out.println("0. Rock");
                System.out.println("1. Paper");
                System.out.println("2. Scissors");

                h = myScan.nextInt();

                k = myRand.nextInt(3);

                System.out.println("k = " + k + " h = " + h);

                if ( h==k )
                {
                    System.out.println("Tie Game!");
                }
                else if ( (h==R && k==S) || (h==S && k==P) || (h==P && k== R) )
                {
                    System.out.println("User Wins!");
                }
                else
                {
                    System.out.println("Computer Wins!");
        }
        }
}
