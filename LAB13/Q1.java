public class Q1 {
    public static void main(String[] args) {
    String str1 = "welcome to Java Programming",
    str2 = "hello world", 
    str3 = " hello",
    str4 = "good morning";
    
    System.out.println(str3.concat(str4));
    
    System.out.println(str1.isEmpty());
    
    String[] arr = str2.split(" ");
    for (String it : arr) {
    System.out.println(it);
    }
    System.out.println(str3.trim());
    System.out.println(str3.toUpperCase());
    System.out.println(str3.toLowerCase());
    
    System.out.println(str3.replace('l', 'p'));
    String s1 = new String("hello");

    String s2 = str3.intern();
    System.out.println(s1 == str3);
    System.out.println(s2 == str3);
    
    System.out.println(str1.indexOf("java"));
    byte[] barr = str3.getBytes();
    for (int i = 0; i < barr.length; i++) {
    System.out.println(barr[i]);
    }
    
    System.out.println(str3.substring(0, 2));
    } 
}