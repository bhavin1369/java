import java.util.Scanner;
public class fibonacciusing {


	public static void main(String[] args) {
		int n,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		n=sc.nextInt();
		c=fib(n);
	}
	public static int fib(int a)
	{
		int i=0,d=0,e=1,b=0;
		for(i=0;i<=a;i++)
    	{
        if(i<=0)
		d=i;
        else
        {
        d=e+b;
        e=b;
        b=d;
		System.out.print(+e);
		System.out.print(" ");
        }
		}
	return 0;
    }
}