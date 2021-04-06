
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax;
        
        System.out.println("Value of the gift?");
        int num = scan.nextInt();
        
        if(num > 1000000){
            tax = (double) (142100 + ((num - 1000000) * 0.17));
            System.out.println("Tax: " + tax);
        } else if(num >= 200000 && num <= 1000000) {
            tax = (double) (22100 + ((num - 200000) * 0.15));
            System.out.println("Tax: " + tax);
        } else if(num >= 55000 && num <= 200000) {
            tax = (double) (4700 + ((num - 55000) * 0.12));
            System.out.println("Tax: " + tax);
        } else if(num >=25000 && num <= 55000) {
            tax = (double) (1700 + ((num - 25000) * 0.10));
            System.out.println("Tax: " + tax);
        } else if(num >= 5000 && num <= 25000) {
            tax = (double) (100 + ((num - 5000) * 0.08));
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }
        
        
        
    }
}
