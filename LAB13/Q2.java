public class Q2 {
    public static void main(String[] args) {
    StringBuffer str1 = new StringBuffer("WELCOME TO JAVA PROGRAMMING");
    StringBuffer str2 = new StringBuffer("HELLO WORLD");
    StringBuffer str3 = new StringBuffer("HELLO");
    StringBuffer str4 = new StringBuffer("GOOD MORNING");
  
    str3.append("WORLD");
    System.out.println(str3);

    str4.insert(3, "PEOPLE");
    System.out.println(str4);

    str1.replace(1, 3, "JAVA");
    System.out.println(str1);
 
    str1.delete(1, 2);
    System.out.println(str1);

    str3.reverse();
    System.out.println(str3);

    System.out.println(str1.capacity());

    str1.ensureCapacity(10);
    System.out.println(str1.capacity());

    System.out.println(str1.charAt(5));
    } 
}