
    interface VehicleInheritance{
        public void turnleft();
        public void turnright();
        public void accelaration();
        public void slowdown();
    }
     class Car implements VehicleInheritance {
        public void turnLeft(){
            System.out.println("left");
        }
        public void turnright(){
            System.out.println("right");
        }
        public void accelaration(){
            System.out.println("speed");
        }
        public void slowdown(){
            System.out.println("brake");
        }
    }
    public class Interfaceex {
        public static void main(String[] args) {
            Car c=new Car();
            c.turnright();
            c.turnLeft();
            c.accelaration();
            c.slowdown();
        }
    }