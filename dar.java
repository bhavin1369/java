import java.util.Scanner;

public class dar {
    public static void main(String[] args) {
      try{
            
        int a = 12, b = 0, c;
            c = a / b;
            System.out.println(c);
            int x[]=new int[2];
            Scanner y=new Scanner(System.in);
            for (int i=1;i<2;i++){
                x[i]=y.nextInt();
            System.out.println(x[i]);
            }
        }
         catch (ArithmeticException e) {

            System.out.println("Aerithmetic Exception");
         }

         
        catch (Exception e2) {

            System.out.println("Array Exception");

        }
        System.out.println("No Exception");

    }
}
