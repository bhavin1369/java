import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        int a,b,c;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter angle one:");
          a=sc.nextInt();
          System.out.println("enter angle second:");
          b=sc.nextInt();
          System.out.println("enter angle third:");
          c=sc.nextInt();
          if(a+b+c==180)
          {
            System.out.println("triangle is valid:");
          }
          else{
            System.out.println("triangle is not valid:");
          }
    }
    
}
