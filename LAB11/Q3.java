class Q3 {
    public static void main(String[] args) {

try{
        
      try{
        int []arr= new int[3];
          arr[5]=10;
         }
          catch(ArrayIndexOutOfBoundsException e)
          {
              System.out.println(e);
          }

      try{
        int ab = Integer.parseInt(null); 
        } 
       catch(NumberFormatException e)
      {
      System.out.println(e);
       }
    } 
    catch(Exception e)  
        {  
            System.out.println(e);  
        }     


    
}
}
