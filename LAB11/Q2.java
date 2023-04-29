class Q2 {
    
    public static void main(String[] args) {
       

        //ArithmeticException

        int a=0;
        int b=5;
        int c;
        try{
        c=b/a;
        }
        catch(ArithmeticException e){
        System.out.println(e);
        }

        //NullPointerException

        String s=null;
      try{
        int l=s.length();
      }
      catch(NullPointerException e)
      {
          System.out.println(e);
      }

     // ArrayIndexOutOfBoundsException

      int []arr= new int[3];
      try{
          arr[5]=10;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println(e);
      }

// NumberFormatException

      try{
      int ab = Integer.parseInt(null); 
      } 
     catch(NumberFormatException e)
    {
    System.out.println(e);
     }
    }
}
