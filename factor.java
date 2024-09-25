import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("enter number");
        int n=sc.nextInt();
        System.out.println("factor are:");
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(""+i);
            }
            i++;
        }
    }
}
