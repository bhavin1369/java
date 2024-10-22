import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,o;
        System.out.println("enter num:");
        n=sc.nextInt();
        System.out.println("enter power of num:");
        m=sc.nextInt();
        o=Power(m,n);
        System.out.println("your ans is:"+o);  
    } 
    public static int Power (int a,int b)
    {
      int r=1;
      for(int i=0;i<a;i++)
      {
        r=r*a;
      }
      return r;
    }
}
