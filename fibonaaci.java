import java.util.Scanner;

public class fibonaaci {
  public static void main(String[] args) {
    int n,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the num:");
    n=sc.nextInt();
    c=Fib(n);
    System.out.println("Fibonacci is:"+c);
    for(int i =0; i<=n ; i++){
      System.out.print(c+" ");
    }
        
  }

  public static int Fib(int n)
  {
    int a = n;
    if(a==0)
    {
      return 0;
    }
    if(a==1)
    {
      return 1;
    }
    int x=0;
    

    x= Fib(a-1) + Fib(a-2);
    return x;    
    }
}