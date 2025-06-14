import java.util.Scanner;

class a{
    float pi=22/7;
}
class r extends a{
    int rai;
    void raidus(int r){
    rai=r;
    }
}
class h extends r{
    int hie;
    void highet(int h){
        hie=h;
    }
}
class v extends h{
    float vol=pi*rai*rai*hie;
    void show(){
        System.out.println("volume="+vol);

    }
}
 class vloumecylinder {
    public static void main(String[] args) {
        
    r superobjr=new r();
    superobjr.raidus(21);
    h superobjh=new h();
    superobjh.highet(20);
    v superobjv=new v();
    superobjv.show();
    }

}
