import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int x;
        System.out.println("enter value of x");
        x=sc.nextInt();
        switch(x)
        {
            case 1:
            System.out.println("january");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("march");
            break;
            case 4:
            System.out.println("aprill");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("june");
            break;
            case 7:
            System.out.println("julay");
            break;
            case 8:
            System.out.println("aughast");
            break;
            case 9:
            System.out.println("septamber");
            break;
            case 10:
            System.out.println("octomber");
            break;
            case 11:
            System.out.println("november");
            break;
            case 12:
            System.out.println("december");
            break;
        }
    }
}