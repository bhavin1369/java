interface A{
    public void hello();
    public void bye();
}
interface C extends A{
    public void hi();
}
interface B extends A{
    public void by();
}
class cla implements C {
    public void hello(){
        System.out.println("hello bhai");
    }
    public void bye(){
        System.out.println("bye bhai");
    }
    public void hi(){
        System.out.println("hi bhai");
    }
}
class boy implements B{
    public void hello(){
        System.out.println("hello bhai");
    }
    public void bye(){
        System.out.println("bye bhai");
    }
    public void by(){
        System.out.println("by bhai");
    }
}
public class interfacehirechy {
    public static void main(String[] args) {
        cla d=new cla();
        boy e=new boy();
        d.hello();
        d.bye();
        e.hello();
        e.bye();
        d.hi();
        e.by();
    }
    
}
