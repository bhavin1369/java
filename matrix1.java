import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row of matrix: ");
        int row = scanner.nextInt();
        System.out.print("Enter coloum of matrix: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("enter your matrix elements row wies:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}