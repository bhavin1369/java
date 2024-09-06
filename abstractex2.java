abstract class animal{
    public abstract int getwalk();
    public abstract int geteat();
    public abstract int getsleep();
    public abstract int getrun();
    public abstract String getvlove();
}
class lion extends animal{
    public int getwalk(){
        return 53;
    }
    public int geteat(){
        return 6;
    }
    public int getsleep(){
        return 8;
    }
    public int getrun(){
        return 110;
    }
    public String getvlove(){

        return "roar";
    }
}
class panda extends animal{
    public int getwalk(){
        return 34;
    }
    public int geteat(){
        return 8;
    }
    public int getsleep(){
        return 12;
    }
    public int getrun(){
        return 20;
    }
    public String getvlove(){

        return "shuuu";
    }
}
public class abstractex2 {
    public static void main(String[] args) {
        lion l=new lion();
        panda p=new panda();
        System.out.println(l.getwalk());
        System.out.println(l.getvlove());
        System.out.println(l.getsleep());
        System.out.println( l.getrun());
        System.out.println( l.geteat());
        System.out.println(p.getwalk());
        System.out.println( p.getvlove());
        System.out.println( p.getsleep());
        System.out.println( p.getrun());
        System.out.println(p.geteat());
    }   
}