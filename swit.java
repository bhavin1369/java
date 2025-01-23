import java.util.Scanner;
public class swit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter firts number");
        int f1=sc.nextInt();
        System.out.println("enter second number");
        int f2=sc.nextInt();
        System.out.println("enter third number");
        int f3=sc.nextInt();
        System.out.println("enter fourth number");
        int f4=sc.nextInt();
        System.out.println("enter fifth number");
        int f5=sc.nextInt();
        System.out.println("enter 1 to find largest number\nenter 2 to find smallest number\nenter 3 to find average of number\nenter 4 to find sum of number");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            if(f1>f2&&f1>f3&&f1>f4&&f1>f5)
            {
                System.out.println("max="+f1);
            }
            else if(f2>f1&&f2>f3&&f2>f4&&f2>f5)
            {
                System.out.println("max="+f2);
            }
            else if(f3>f1&&f3>f2&&f3>f4&&f3>f5)
            {
                System.out.println("max="+f3);
            }
            else if(f4>f1&&f4>f3&&f4>f2&&f4>f5)
            {
                System.out.println("max="+f4);
            }
            else if(f5>f1&&f5>f3&&f5>f4&&f5>f2)
            {
                System.out.println("max="+f5);
            }
            break;
            case 2:
            if(f1<f2&&f1<f3&&f1<f4&&f1<f5)
            {
                System.out.println("min="+f1);
            }
            else if(f2<f1&&f2<f3&&f2<f4&&f2<f5)
            {
                System.out.println("min="+f2);
            }
            else if(f3<f1&&f3<f2&&f3<f4&&f3<f5)
            {
                System.out.println("min="+f3);
            }
            else if(f4<f1&&f4<f3&&f4<f2&&f4<f5)
            {
                System.out.println("min="+f4);
            }
            else if(f5<f1&&f5<f3&&f5<f4&&f5<f2)
            {
                System.out.println("min="+f5);
            }
            break;
            case 3:
            float avg;
            avg=(f1+f2+f3+f4+f5)/5;
            System.out.println("average is:"+avg);
            break;
            case 4:
            int sum;
            sum=f1+f2+f3+f4+f5;
            System.out.println("sum is:"+sum);
        }
    }
}