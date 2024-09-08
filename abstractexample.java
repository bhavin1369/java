abstract class car{
    public  abstract double  getavg() ;
}
class BMW extends car{
    public double getavg(){
        return 61.5;
    }
}
class Gwagon extends car{
    public double getavg(){
        return 12;
    }
}
class urus extends car{
    public double getavg(){
        return 7.5;
    }
}
public class abstractexample {
    public static void main(String[] args) {
        BMW B=new BMW();
        Gwagon G=new Gwagon();
        urus u=new urus();
        System.out.println(B.getavg());
        System.out.println(G.getavg());
        System.out.println(u.getavg());
    }
}
