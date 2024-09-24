import java.util.Scanner;

class bank{
    void rate(int x){
        int c=x;
        c=(x*6)/100;
    }
}
class sbi extends bank{
    void rate (int x){
        int z=x;
        z=(x*6)/100;
        System.out.println(z);
    }
}
class icici extends bank{
    void rate (int x){
        int z=x;
        z=(x*7)/100;
        System.out.println(z);
    }
}
class hdfc extends bank{
    void rate (int x){
        int z=x;
        z=(x*8)/100;
        System.out.println(z);
    }
}
public class expr {
    public static void main(String[] args) {
        int x;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        x=sc.nextInt();
        bank b=new bank();
        sbi s=new sbi();
        icici i=new icici();
        hdfc h=new hdfc();
        b.rate(x);
        s.rate(x);
        i.rate(x);
        h.rate(x);
    }
}
