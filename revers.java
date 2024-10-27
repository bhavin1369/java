import java.util.Scanner;

public class revers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i=1;
        System.out.print("enter number :");
        n=sc.nextInt();
        while(n!=0)
        {
            i=n%10;
            System.out.print(+i);
            n=n/10;
        }
    }
    
}
