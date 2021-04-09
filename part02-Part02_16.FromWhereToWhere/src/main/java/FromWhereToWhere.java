
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Where to?");
        int num = scanner.nextInt();
        System.out.println("Where from?");
        int two = scanner.nextInt();
        
        for(int i =two; i <=num; i++){
            System.out.println(i);
        }
    }
}
