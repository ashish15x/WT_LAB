import java.util.*;
public class Q6 {
    public static void main(String Args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        n= sc.nextInt();

        int temp=0,rem=0,num,sum=0,product=1;
        num=n;
        while(num>0)
        {
          rem=num%10;
          sum=sum+rem;
          product=product*rem;
         num=num/10;

        }
        if(sum==product)
        System.out.println("Number is a spy number");
        else
        System.out.println("Number is not a spy number");



    }
}
