import java.util.Scanner;
public class methodswap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter value of a:");
        a=sc.nextInt();
        System.out.println("enter value of b:");
        b=sc.nextInt();
        swap(a,b);
    }
    public static void swap(int a, int b)
    { int c=0;
        c=a;
        a=b;
        b=c;
    System.out.println("value a is :"+a);
    System.out.println("value b is :"+b);
    }
}