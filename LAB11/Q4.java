public class Q4{
    public static void main(String args[]){
    try{
    int arr[]=new int[3];
    arr[7]=30/0;
    }
    catch(ArithmeticException e){System.out.println(e);}
    catch(NullPointerException e){ System.out.println(e);}
    catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
    catch(NumberFormatException e){System.out.println(e);}
    catch(Exception e){System.out.println(e);}
    
    }
}