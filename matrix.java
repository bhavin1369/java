import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("enter row of matrix");
        m=sc.nextInt();
        System.out.println("enter coloum of matrix");
        n=sc.nextInt();
        int[][] a=new int[m][n];
        int i,j;
        System.out.println("enter your matrix elements row wies:");
        for(i=1;i<=m;i++);
        {
            for(j=1;j<=n;j++)
            {
                
                a[i][j]=sc.nextInt();
            }
        }
        for(i=1;i<=m;i++);
        {
            for(j=1;j<=n;j++)
            {
                System.out.println("your matrix is:"+a[i][j]);
            }
    
        }
    }
    
}