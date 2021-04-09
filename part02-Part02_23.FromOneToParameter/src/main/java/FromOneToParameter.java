
import java.util.*;
public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        printUntilNumber(num);
        
        

    }
    public static void printUntilNumber(int num){
        
        for(int i =1; i<= num;i++){
            System.out.println(i);
        }
        
    }

}
