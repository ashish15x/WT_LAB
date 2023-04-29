import java.io.*;
public class Q3b
{
public static void main(String args[]) 
{
try {
FileWriter fw = new FileWriter("abc.txt");
fw.write("Name : Ashish Kumar \nRoll no: 20051513");
fw.close();
FileReader fr = new FileReader("abc.txt");
int i;
while ((i = fr.read()) != -1) {
System.out.print((char) i);
}
fr.close();
}
 catch (Exception e) 
{
System.out.println(e);
}
 }
 }