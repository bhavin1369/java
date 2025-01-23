import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value a:");
        a=sc.nextInt();
        System.out.println("enter value b:");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the a is :"+a);
        System.out.println("the b is :"+b);
    }
    
}                               
        