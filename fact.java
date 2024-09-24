import java.util.Scanner;

public class fact {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=1,x;
            System.out.println("enter value of x:");
            x=s.nextInt();
            for (int i=1;i<=x;i++){
                n=n*i;
            }
            System.out.println(n);
        }
    }