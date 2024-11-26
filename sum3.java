import java.util.Scanner;

public class sum3 {
    
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter first a number");
        a=sc.nextInt();
        sum(a);

}
public static void sum(int x){
    int i,sum=0;
    for(i=0;i<=x;i++){
       sum=sum+i;
    }
    System.out.println("sum="+sum);
}

}
