import java.util.Scanner; 
public class palin2 {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        String x; 
        System.out.println("Enter the Strinng: "); 
        x=sc.nextLine(); 
        System.out.println("String is : "+x); 
        String b=new StringBuilder(x).reverse().toString(); 
        if( x.equals(b)  ){ 
            System.out.println("String is palindrome."); 
        }else{ 
            System.out.println("String is not palindrome."); 
        } 
} 
} 