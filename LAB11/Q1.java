import java.util.Scanner;
interface method {
void earnings(int x);
void deductions(int x);
void bonus(int x);
}
abstract class manager implements method {
public void earnings(int x) {
double total_sal = x + 0.8 * x + 0.15 * x;
System.out.println("earnings for substaff " + total_sal);
}
public void deductions(int x) {
double ded = x * 0.12;
System.out.println("deductions for substaff " + ded);
} }
class substaff extends manager {
public void bonus(int x) {
double b = 0.50 * x;
System.out.println("bonus for substaff " + b);
} }
public class Q1 {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
method obj = new substaff();
System.out.println("enter salary");
int w = s.nextInt();
obj.earnings(w);
obj.deductions(w);
obj.bonus(w);
} }