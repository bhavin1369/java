import java.util.Scanner;
public class BtoD {
    public static void main(String[] args) {
        String binaryString;
        Scanner sc=new Scanner(System.in); 
        binaryString =sc.nextLine();
        int decimalNumber = Integer.parseInt(binaryString, 2);
        System.out.println("Binary String: " + binaryString);
        System.out.println("Decimal Equivalent: " + decimalNumber);
		int x;
        x=sc.nextInt();
		System.out.println(Integer.toBinaryString(x));
    }
    }