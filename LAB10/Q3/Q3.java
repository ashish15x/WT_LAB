import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
abstract class Volume {
abstract void find_Volume_513();
}
class Spehere extends Volume {
float r;
Spehere() {
Scanner s = new Scanner(System.in);
r = s.nextFloat();
}
void find_Volume_513() {
System.out.format("Volume of Spehre = %.2f\n", (1.3 * 3.14 * r * r * r));
} }
class Cylinder extends Volume {
float r;
float l;
Cylinder() {
Scanner s = new Scanner(System.in);
r = s.nextFloat();
l = s.nextFloat();
}
void find_Volume_513() {
System.out.format("Volume of cylinder = %.2f\n", (3.14 * r * r * l));
} }
class Cuboid extends Volume {
float l, b, h;
Cuboid() {
Scanner s = new Scanner(System.in);
l = s.nextFloat();
b = s.nextFloat();
h = s.nextFloat();
}
void find_Volume_513() {
System.out.format("Volume of Cuboid = %.2f\n", (l * b * h));
} }
class Cone extends Volume {
float r, h;
Cone() {
Scanner s = new Scanner(System.in);
r = s.nextFloat();
h = s.nextFloat();
}
void find_Volume_513() {
System.out.println("Volume of cone = " + (3.14 * r * r * h));
} }
public class Q3 {
public static void main(String[] args) {
Spehere obj1 = new Spehere();
obj1.find_Volume_513();
Cylinder obj2 = new Cylinder();
obj2.find_Volume_513();
Cuboid obj3 = new Cuboid();
obj3.find_Volume_513();
Cone obj4 = new Cone();
obj4.find_Volume_513();
} }