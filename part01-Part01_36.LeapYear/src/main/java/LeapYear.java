
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a year: ");
        int num = scan.nextInt();
        System.out.println(num);
        
        if(num % 100 != 0 && num % 4 == 0) {
            System.out.print("The year is a leap year.");
        } else if(num % 400 == 0) {
            System.out.print("The year is a leap year.");
        } else {
            System.out.print("The year is not a leap year.");
        }
    }
}
