import java.util.Scanner;

public class stringfuncation {
    public static void main(String[] args) {
        String bh="bhavin";
        String bh1="MUCHHALA";
        String bh2=String.format("%s%s",bh,bh1);
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("1.find length\n2.convert loweer to upper\n3.convert upper to loweer\n4.to trim\n5.to substring\n6.to charat\n7.to concat string");
         n=sc.nextInt();
         switch(n)
         {
            case 1:
            System.out.println(""+bh.length());  
            break;
            case 2:
            System.out.println(bh.toUpperCase());
            break;
            case 3:
            System.out.println(bh.toLowerCase());
            break;
            case 4:
            System.out.println(bh.trim());
            break;
            case 5:
            System.out.println(""+bh.substring(6));
            System.out.println(""+bh.substring(0,6));
            break;
            case 6:
            System.out.println(bh.charAt(n));
            System.out.println(bh.charAt(3));
            break;
            case 7:
            System.out.println(bh2);


    } 

         }

    }
    

