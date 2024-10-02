class parent {
    void print(){
        System.out.println("hello");
    }
}
class child extends parent {
    void display(){
        System.out.println("bye");
    }
}
public class instanceofoperator {
    public static void main(String[] args) {
        parent p=new parent();
        child c=new child();
        p=null;
        System.out.println(c instanceof parent);
    }
    
}
