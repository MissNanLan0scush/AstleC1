
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int first = scanner.nextInt();
        System.out.println("Give the second number:");
        int second = scanner.nextInt();
        
        System.out.println(first + " + " +  second + " = " + (first+second));

    }
}
