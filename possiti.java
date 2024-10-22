import java.util.Scanner;

public class possiti {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a:");
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println("the number is possitive:"+a);
        }
        else
        {
            System.out.println("the number is negeative:"+a);
        }
    }
    
}
