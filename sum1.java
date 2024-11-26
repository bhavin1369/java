import java.util.Scanner;

public class sum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1,sum=0,n;
        System.out.println("enter a number");
        n=sc.nextInt();
        while(i<=n)
        {
        if(i%2==0) 
                sum=sum+i;
                i++;
            }
            System.out.println("sum="+sum);
    }
}
