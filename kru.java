class A extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("krushang");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e) {
        System.out.println(e);
        }
}
}
}
public class kru {
	
	public static void main(String[] args) {
		A t = new A();
		t.start();
		System.out.println("savaliya");
	}
}