import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        int n,i=1;
        System.out.println("enter value of n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (i<=n) {
            
            if(n%i==0){
                System.out.println("number is prime");
            }else{
                System.out.println("number is not prime");
            }
        }
    }
}
