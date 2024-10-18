class shape{
    void draw(){
        System.out.println("draw shape");
    }
}
class circle extends shape{
    void draw(){
System.out.println("draw circle");
    }
}
class square extends shape{
    void draw(){
        System.out.println("draw square");
    }
}
public class overriding {
    public static void main(String[] args) {
        shape a=new shape();
        a.draw();
        circle b=new circle();
        b.draw();
        square c=new square();
        c.draw();
    }
    
}
