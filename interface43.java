interface Vechical{
    int a=10;
    public void right();
    public void left();
    public void speed();
    public void stop();
}
class Car implements Vechical{
    public void right(){
        System.out.println("turn right");

    }
    public void left(){
        System.out.println("turn left");
    }
    public void speed(){
        System.out.println("increass speed");
    }
    public void stop(){
        System.out.println("stop the car");
    }
}
public class interface43 {
    public static void main(String[] args) {
        Car c= new Car();
        c.right();
        c.left();
        c.stop();
        c.speed();
        Vechical v=new Car();
        v.speed();
        v.stop();
        v.left();
        v.right();
    }
}
