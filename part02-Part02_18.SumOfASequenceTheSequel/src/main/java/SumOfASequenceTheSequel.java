
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("First number?");
        int first = scanner.nextInt();
        System.out.println("Last number?");
        int second = scanner.nextInt();
        
        for(int i = first; i<=second;i++){
            total += i;
        }
        System.out.println(total);
        
    }
}
