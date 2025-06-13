import java.util.Scanner;

public class triperamiter {
    public static void main(String[] args) {
        int a,b,c,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value a:");
        a=sc.nextInt();
        System.out.println("enter value b:");
        b=sc.nextInt();
        System.out.println("enter value c:");
        c=sc.nextInt();
        s=a+b+c;
        System.out.println("the peramiter of tri is :"+s);
    }
    
}
