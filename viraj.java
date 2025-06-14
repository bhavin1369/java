class student{
    private String name;
    private String city;
    private int rollno;
    private String contect;
    public String getName(){ return name; }
    public void setName(String name) { this.name=name;}
    public String getCity(){ return city;}
    public void setCity(String city) { this.city=city;}
    public int getRollno(){ return rollno; }
    public void setRollno(int rollno) { this.rollno=rollno;}
    public String getContect(){ return contect; }
    public void setContect(String contect) { this.contect=contect;}
}
public class viraj {
    public static void main(String[] args) {
        student s=new student();
        s.setName("Viraj");
        s.setCity("Rajkot");
        s.setRollno(27);
        s.setContect("7990685454");
        System.out.println("Name:"+s.getName());
        System.out.println("City"+s.getCity());
        System.out.println("rollno:"+s.getRollno());
        System.out.println("contect no:"+s.getContect());
    }
}
