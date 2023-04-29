import java.io.*;
public class Q4 {
public static void main(String[] args) {
try {
FileInputStream fin = new FileInputStream("f.txt");
FileInputStream finn = new FileInputStream("abc.txt");
int flag = 0;
int i = 0;
while ((i = fin.read()) != -1)
 {
if (i != finn.read())
 {
System.out.println("Not Equal");
flag = 1;
break;
 }
 }
if (flag == 0) {
System.out.println("Not Equal");
}
} catch (Exception e) {
System.out.println(e);
} 
 }
 }