import java.util.Scanner;

public class assending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j,i,n,x;
        System.out.println("enter array elements:");
        n=sc.nextInt();
        int[] a=new int[n];
        int [] b=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("enter a["+i+"]");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                x=a[i];
                a[i]=a[j];
                a[j]=x;
            }
        }
    }
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}
