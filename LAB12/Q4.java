public class Q4
 {
public static void main(String[] args)
 {
int a[] = new int[5];
try {
a[3] = 5;
a[6] = 25 / 0;
} 
catch (ArithmeticException e) {
System.out.println(e);
} 
catch (ArrayIndexOutOfBoundsException e) {
System.out.println(e);
} 
finally {
System.out.println("Always Executed");
} 
} 
}