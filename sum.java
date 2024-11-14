import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter first a number");
        a=sc.nextInt();
        System.out.println("enter secon a number");
        b=sc.nextInt();
        add(a, b);
    }
    public static void add(int a,int b){
        int c;
        c=a+b;
        System.out.println("the sum is"+c);
        
    }
}
