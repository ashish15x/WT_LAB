package Let_Me_Calculate;
import calculator.*;
public class Calculate {
public static void main(String[] args) {
CALC c_513 = new CALC();
int x = c_513.add_513(10, 5);
System.out.println("Addition : " + x);
x = c_513.sub_513(10, 5);
System.out.println("Substraction : " + x);
x = c_513.multiplication_513(10, 5);
System.out.println("Multiplicaiton : " + x);
x = c_513.division_513(10, 5);
System.out.println("Division : " + x);
x = c_513.mod_513(10, 5);
System.out.println("Mod : " + x);
} }