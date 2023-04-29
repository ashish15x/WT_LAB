import java.io.*;
class A 
{
void msg()
{
System.out.println("parent method");
} 
}
public class Q5 extends A 
{
void msg() throws IOException 
{
System.out.println("TestExceptionChild");
}
public static void main(String args[]) 
{
A p = new A();
p.msg();
} 
}