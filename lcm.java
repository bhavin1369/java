import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,p,x,y,z,hcf,lcm;
        System.out.println("enter number");
        n=sc.nextInt();
        System.out.println("enter second number");
        p=sc.nextInt();
        x=n;
        y=p;
        while(p!=0)
        {
            z=p;
            p=n%p;
            n=z;
        }
        hcf=n;
        lcm=(x*y)/hcf;
        System.out.println("LCM IS = "+lcm);
        System.out.println("HCF is = "+hcf);
    }
    
}
