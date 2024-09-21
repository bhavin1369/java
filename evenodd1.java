import java.util.Scanner;

public class evenodd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter a number");
        a=sc.nextInt();
    }
    public static void findevenodd1(int a){
        if(a%2==0)
        {
            System.out.println("the number is even"+a);

        }
        else{
            System.out.println("the number is odd"+a);
        }
    }
}
