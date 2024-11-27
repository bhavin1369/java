import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value a:");
        a=sc.nextInt();
        System.out.println("enter value b:");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("the ans is :"+a);
        System.out.println("the ans is :"+b);
    }
    
}
