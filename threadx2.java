class a extends Thread{
    public void  run(){
        for (int i=0;i<5;i++){
        System.out.println("Bhavin");
        try{
            Thread.sleep(1000);
        }
            catch(Exception e){
            System.out.println(e);
        }
    }
}
}
public class threadx2 {
    public static void main(String[] args) {
        a p=new a();
        p.start();
            System.out.println("Muchhala");
        }
    }