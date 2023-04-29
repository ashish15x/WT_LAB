import java.io.IOException;
public class Q3 
{
void m() throws IOException
{
throw new IOException("");
}
void p() 
{
try {
  m();
} 
catch (Exception e)
 {
System.out.println(e);
} 
}
public static void main(String args[]) 
{
Q3 obj = new Q3();
obj.p();
} 
}