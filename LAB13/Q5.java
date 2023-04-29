public class Q5 {
    public static void main(String[] args) {
    String s1 = "Hello";
    StringBuffer s2 = new StringBuffer(s1);
    for (int i = 0; i < s1.length(); i++)
    {
    if (Character.isLowerCase(s1.charAt(i))) 
    {
    s2.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
    } 
    else if (Character.isUpperCase(s1.charAt(i))) 
    {
    s2.setCharAt(i, Character.toLowerCase(s1.charAt(i)));
    }
 }
    System.out.println("String after change : " + s2);
    } 
}