import java.util.Scanner;

public class Matrixadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers of n");
        int n=sc.nextInt();
        System.out.println("enter the number of m");
        int m=sc.nextInt();
        System.out.println("enter the numbers of p");
        int p=sc.nextInt();
        System.out.println("enter the number of q");
        int q=sc.nextInt();
        int[][] matrix=new int[n][m];
        int[][] matrix2=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter 1st matrix"+(i+1)+"n and "+(j+1)+"m element");
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                System.out.println("enter 2st matrix"+(i+1)+"n and "+(j+1)+"m element");
                matrix2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){


                System.out.print("  "+(matrix[i][j]+matrix2[i][j]));
            
            }
            System.out.println();
        }

    }
    
}
