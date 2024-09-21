import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value a:");
        a=sc.nextInt();
        System.out.println("enter value b:");
        b=sc.nextInt();
        c=a-b;
        if(c%2==0)
        {

            System.out.println("the number is even"+c);
        }
        else{

            System.out.println("the number is odd :"+c);
        }
    }
    
}
