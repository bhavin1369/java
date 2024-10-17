import java.util.Scanner;

public class oneplus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int[] a=new int[10];
        System.out.println("enter array elements:");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("enter a["+i+"]");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("enter a["+i+"]="+(a[i]+1));
        }
    }    
    
}
