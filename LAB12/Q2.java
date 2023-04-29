import java.util.Scanner;

class TIME_Exception extends Exception
 {
    public TIME_Exception()
     {
        super("Invalid Time");
    }
}

class time 
{
    int h, m, s;
    Scanner sc = new Scanner(System.in);

    time() {
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
    }
}

public class Q2 {
    public static void main(String[] args)
     {
        time p = new time();
        if (p.h > 23 || p.m > 59 || p.s > 59)
         {
            try {
                throw new TIME_Exception();
            } catch (TIME_Exception e) {
                System.out.println(e);
            }
        } 
        else
         {
            System.out.println("Valid Time");
        }

    }
}