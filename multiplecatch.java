import java.util.Scanner;

public class multiplecatch {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        try {
            int[] a=new int[2];
            int x = 5 / 0;
            for(int i=0;i<2;i++){
            a[i]=sc.nextInt();
            System.out.println(a[i]);}
            }
        catch(ArithmeticException e1) {
                System.out.println("error");   
            
    }
    catch(ArrayIndexOutOfBoundsException e2){
        System.out.print("Entered array index is out of bounds: ");  
}
}}