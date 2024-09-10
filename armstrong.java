import java.util.Scanner;
public class armstrong {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a n: ");
        int n = sc.nextInt();
        int x = n;
        int a = 0;
        while (x != 0) {
            a++;
            x /= 10;
        }
        x = n;
        int sum = 0;
        while (x != 0) {
            int d = x % 10;
            sum += Math.pow(d, a);
            x /= 10;
        }
        if (sum == n) {
            System.out.println(n + " is an Armstrong");
        } else {
            System.out.println(n + " is not an Armstrong");
        }

    }
}