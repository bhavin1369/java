class student{
    private String name;
    private int roll;
    private long con;
    private String city;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getroll(){
        return roll;
    }
    public void setroll(int roll){
        this.roll=roll;
    }
    public long getcon(){
        return con;
    }
    public void setcon(long con){
        this.con=con;
    }
    public String getcity(){
        return city;
    }
    public void setcity(String city){
        this.city=city;
    }
}
public class encapsulation1 {
    public static void main(String[] args) {
        student s=new student();
        s.setname("bhavin");
        s.setroll(43);
        s.setcon(931335688);
        s.setcity("rajkot");
        System.out.println("name="+s.getname());
        System.out.println("roll="+s.getroll());
        System.out.println("con="+s.getcon());
        System.out.println("city="+s.getcity());
    }
    
}
