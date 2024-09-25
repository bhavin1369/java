import java.util.Scanner;
public class fibo {

    public static void PrintFib(int a,int b,int n){
            if(n==0){
                return;
            }
            int c=a+b;
            System.out.print( " " +c);
            PrintFib(b, c, n-1);
        }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n to print fib");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a);
        System.out.print(" "+b);
        PrintFib(a, b, n-2);}} 