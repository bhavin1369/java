import java.util.Scanner;

public class methodtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x;
        System.out.println("enter number to print table:");
        n=sc.nextInt();
        x=table(n);
    }
    public static int table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(+n*i);
        }
        return  n;
    }
    
}
