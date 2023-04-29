import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A No : ");
        int num = sc.nextInt();
        String[] arr = new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };     
        int a = num % 10;
        a = a - 1;
        num = num / 10;
        int b = num % 10;
        b = b - 1;
        if (b < 0) {
            System.out.print(arr[a]);
        } 
        else {
            System.out.print(arr[b] + arr[a]);
        }

    }
}