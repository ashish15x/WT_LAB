import java.io.*;
public class Q3a {
public static void main(String args[]) {
try {
FileOutputStream fout = new FileOutputStream("f.txt");
String s = "Name : Ashish Kumar \nRoll no: 20051513";
byte b[] = s.getBytes();
fout.write(b);
fout.close();
FileInputStream fin = new FileInputStream("f.txt");
int i = 0;
while ((i = fin.read()) != -1) {
System.out.print((char) i);
}
fin.close();
} catch (Exception e) {
System.out.println(e);
}
 } 
}