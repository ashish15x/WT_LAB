 class Q6 {
    public static void main(String[] args) {
        String s1="welcome to Java Programming";
        String s2="Welcome to JAVA Programming";
        String s3="welcome to Java Programming";
        String s4= new String("welcome to Java Programming");


        System.out.println(s1.equals(s2));

         System.out.println(s1==s4);
        
       System.out.println(s1.compareTo(s2));

       System.out.println(s1.equalsIgnoreCase(s2));
       
       System.out.println(s1.length());

    }
}
