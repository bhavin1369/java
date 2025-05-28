class a extends Thread{
    public void  run(){
        System.out.println("viraj");
    }
}
public class threadex {
    public static void main(String[] args) {
        a p=new a();
        p.start();
        System.out.println("Vaghasiya");
    }
}