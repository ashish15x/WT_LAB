import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String s) {
        super(s);
    }
}

public class Q1 {
    public static void main(String args[]) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            try {
                throw new NegativeNumberException("Given number is less than zero");
            } catch (NegativeNumberException e) {
                System.out.println(e);
            }
        } else {
            System.out.println(num);
        }
    }
}