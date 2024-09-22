class man{
    String [] name=new String[10];
    String [] gender=new String[10];
    String [] haircolour=new String[10];
    int [] age=new int[10];
    synchronized void displayname(String name,String gender,String haircolour,int age){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(haircolour);
        System.out.println(age);
        try{
            Thread.sleep(400);
        }
        catch(Exception a){
            System.out.println(a);
        }
    }

}
class t1 extends Thread{
    man m;
    public t1(man m) {
        this.m = m;
    }
    public void run(){
        m.displayname("bhavin","male","black",19);
    }

}
class t2 extends Thread{
    man m;
    public t2(man m) {
        this.m = m;
    }
    public void run(){
        m.displayname("krushang","female","black",18);
    }

}

public class exam {
    public static void main(String[] args) {
        man m=new man();
        t1 t1=new t1(m);
        t2 t2=new t2(m);
        t1.start();
        t2.start();

    }
}
