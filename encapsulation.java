class person{
    public String name;
    public int age;
    public String getname (){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int a){
        this.age=a;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        person p=new person();
        p.setname("bhavin");
        p.setage(19);
        System.out.println("name="+p.getname());
        System.out.println("name="+p.getage());
    }
}