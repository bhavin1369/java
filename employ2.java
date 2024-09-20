import java.util.Scanner;

public class employ2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int [] employid=new int[5];
        String [] name=new String[5];
        String [] joiningdate=new String[5];     
        for(int i=0;i<=n;i++){
            System.out.println("enter employid: ");
            employid[i]=sc.nextInt();
            System.out.println("enter name: ");
            name[i]=sc.next();
            System.out.println("enter joining date: ");
            joiningdate[i]=sc.next();
        }
        for(int i=0;i<=n;i++){
            System.out.println("name="+name[i]);
            System.out.println("emloyid="+employid[i]);
            System.out.println("joining date"+joiningdate[i]);
}
}
}