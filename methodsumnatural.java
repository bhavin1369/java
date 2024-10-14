import java.util.Scanner;

public class methodsumnatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,c;
        System.out.println("enter num:");
        n=sc.nextInt();
        c=sum(n);
        System.out.println("the sum is"+c);
    }
    public static int sum(int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
        sum=sum+i;
        }
        return sum;
    }
    @Override
    public String toString() {
        return "methodsumnatural []";
    }
}