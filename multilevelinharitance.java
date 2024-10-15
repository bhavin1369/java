class A{
    int i;
    int j;
    void showj()
    {
        System.out.println("i="+i+"j="+j);

    }
 }
 class B extends A{

    int k;
    void Showk() {
        System.out.println("k="+k);

    }
    void add()
    {
        System.out.println("i+j+k="+(i+j+k));
    }
 }
 class C extends B{

    int m;
    void showm(){
        System.out.println("m="+m);
    }
    void aad_m(){
        System.out.println("i+j+m="+(i+j+m));
    }
 } 

 public class multilevelinharitance {
    public static void main(String[] args) {
     A superobja=new A();
     superobja.i=10;
     superobja.j=20;
     B superobjb=new B();
     superobjb.k=30;
     superobjb.j=20;
     superobjb.i=10;
     superobja.showj();
     superobjb.Showk();
     superobjb.add();
     C superobjC=new C();
     superobjC.m=30;
     superobjC.i=10;
     superobjC.j=20;
     superobjC.showm();
     superobjC.aad_m();
    }
}
