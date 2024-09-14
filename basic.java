import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,hra,dra;
        System.out.println("enter your basic salary:");
        a=sc.nextInt();
        if(a<1500){
            hra=(a*10)/100;
            System.out.println("hra="+hra);
            dra=(a*90)/100;
            System.out.println("dra="+dra);
            System.out.println("total:"+(hra+dra));
        }
        else if (a>=1500)
        {
            hra=500;
            System.out.println("hra="+hra);
            dra=(a*98)/100;
            System.out.println("dra="+dra);
            System.out.println("total:"+(hra+dra));
        }
    }
    
}
