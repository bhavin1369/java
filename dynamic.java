class A{
    void draw(){
        System.out.println("draw A");
    }
}
class B extends A{
    void draw(){
System.out.println("draw B");
    }
}
class C extends A{
    void draw(){
        System.out.println("draw C");
    }
}
public class dynamic {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        //A r;
       // r=a;
       //r.draw();
        a.draw();
        //r=b;
        //r.draw();
        b.draw();
        //r=c;
        //r.draw();
        c.draw();
    }
}
