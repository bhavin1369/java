import java.util.Scanner;

public class student78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String name,pass,z; 
        System.out.println("enter username :");
        name=sc.nextLine();
        System.out.println("enter passworad:");
        pass=sc.nextLine();
        z=pass;
       System.out.println("username:"+name);
       System.out.println("password:");
       z=sc.nextLine();
       if(pass==z){
        System.out.println("login done");
       }
       else{
        System.out.println("invalid password");
       }
    }
}
