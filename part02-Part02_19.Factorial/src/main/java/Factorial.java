
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 1;

        System.out.println("Give a number:");
        int num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            total = total * i;
        }
        System.out.println("Factorial: " + total);
    }
}
