class a implements Runnable{
    public void run(){
        for(int i=0;i<=5;i++){

            System.out.println("Bhavin");
        }
    }
}
public class runableinterface {
    public static void main(String[] args) {
        a obj = new a();
        Thread t = new Thread(obj);
        t.start();
}
}