import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Zadej z kolika cisel chces average: ");
            int totalCount = sc.nextInt();
            double sum = 0;

            for (int i = 0; i < totalCount; i++) {
                System.out.print("Zadej číslo: ");
                sum += sc.nextDouble();
            }

            System.out.println("Average: " + (sum / totalCount));

    }
}

