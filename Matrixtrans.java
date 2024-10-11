import java.util.Scanner;
public class Matrixtrans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers of n");
        int n=sc.nextInt();
        System.out.println("enter the number of m");
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        int[][] trans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter 1st matrix"+(i+1)+"n and "+(j+1)+"m element");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("original of matrix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("  "+matrix[i][j]);
            }
            System.out.println();
        } 
        for(int j=0;j<m;j++){
                for(int i=0;i<n;i++){
            trans[j][i]=matrix[i][j];
            }
        }
        System.out.println("transpose of matrix is");
        for(int j=0;j<m;j++){
                for(int i=0;i<n;i++){
                System.out.print("  "+trans[j][i]);
            }
            System.out.println();
        }
    }
    
}
