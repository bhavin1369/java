import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,n=1;
        System.out.println("enter value of x");
        x=s.nextInt();
        while(x!=0){
            n=x%10;
            System.out.print(n);
            x=x/10;
        }
    }
    
}
