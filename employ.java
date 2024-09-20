import java.util.Scanner; 
public class employ {
    public static void main(String[] args) { 
    Scanner sc=new Scanner(System.in); 
        String[] a=new String[10]; 
        int[] b=new int[10]; 
        String[] c=new String[10]; 
        int i; 
        for(i=1;i<4;i++){ 
            System.out.print("Enter the " +i+" Employee name:"); 
            a[i]=sc.next(); 
            System.out.print("Enter the " +i+" Employee age:"); 
            b[i]=sc.nextInt(); 
            System.out.print("Enter the " +i+ " Employee PHONE NO:"); 
            c[i]=sc.next(); 
            System.out.println(); 
        } 
        System.out.println(); 
        for(i=1;i<4;i++){ 
            System.out.println("Emplyee " +i+  " Detail:"); 
            System.out.println("Employee Name : "  +a[i]); 
            System.out.println("Employee age : "  +b[i]); 
            System.out.println("Employee PHONE NO : "  +c[i]); 
            System.out.println();         
        } 
    } 
     
} 
