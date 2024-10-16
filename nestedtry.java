public class nestedtry {
    public static void main(String[] args) {
      try{  
        try{
            System.out.println("going to div. by a");
            int b=39/0;
      }
      catch(ArithmeticException e){ 
        System.out.println("caught ArithmeticException"+e) ;

    }
    }
    catch(Exception e1){ 
        System.out.println("Caught Excception outerr side" + e1);
}
System.out.println("normal flow ");
}
}