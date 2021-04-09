
public class FromParameterToOne {

    public static void main(String[] args) {
        int number = 5;
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }

}
