import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,mul=1;
        System.out.println("enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            i=n%10;
            mul=mul*i;
            n=n/10;
        }
        System.out.print(+mul);
    }
}
