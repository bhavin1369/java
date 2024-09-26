import java.util.Scanner;

public class fibrecu {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int m;
            System.out.println("enter value m");
            m=sc.nextInt();
            for (int i = 0; i < m; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }