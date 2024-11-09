import java.util.Scanner;

public class strungrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String x;
        System.out.println("enter String:");
        x=sc.nextLine();
        String r = new StringBuilder(x).reverse().toString();
         System.out.println(x.equals(r));
         if(true)
         {
            System.out.println("is palindrome");
         }
     
       
    }
    
}
