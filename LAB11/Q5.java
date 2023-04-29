class Base extends Exception { }
class Derived extends Base { }
public class Q5 {
public static void main(String args[]) {
try {
throw new Derived();
} catch (Derived b) {
System.out.println("//////////////Derived Catch/////////////// ");
} catch (Base d) {
System.out.println("Base Catch");
} } }