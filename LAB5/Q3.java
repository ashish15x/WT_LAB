public class Q3 {
    public static void main(String Args[])
    {
        int n1=0, n2=1, num;
        System.out.print(n1 + " " + n2 + " ");
 
        for (int i = 0; i < 100; i++)
         {
            num = n1 + n2;
            if(num>100)
            break;
            else
            System.out.print(num + " ");
            n1 = n2;
            n2 = num;
            
         }
     }
 }