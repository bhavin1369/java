class dog extends animal{
    void show(){
        System.out.println("bho bho");
    }
}
class cat extends animal{
    void show(){
        System.out.println("meow meow");
    }
}
class lion extends animal{
    void show(){
        System.out.println("roar");
    }
}
public class animal {
    public static void main(String[] args) {
        dog d=new dog();
        d.show();
        cat c=new cat();
        c.show();
        lion l=new lion();
        l.show();
    }
}
