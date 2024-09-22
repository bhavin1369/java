class employee{
    public String name;
    public String address;
    public String jobtitle;
    public int salary;
    public void bonus(int salary){

    }
}
class manager extends employee{
public void bonus(int salary){
int c=(salary*20)/100;
System.out.println("for manager bonus is"+c);
}
}
class developer extends employee{
    public void bonus(int salary){
    int d=(salary*12)/100;
    System.out.println("for developer bonus is"+d);
    }
}
class programmer extends employee{
    public void bonus(int salary){
    int e=(salary*10)/100;
    System.out.println("for programmer bonus is"+e);
    }
}

public class examemploy {
    public static void main(String[] args) {
        employee e=new employee(); 
        manager m=new manager();
        developer d=new developer();
        programmer p=new programmer();
        m.bonus(50000);
        d.bonus(50000);
        p.bonus(50000);
    }
    
}
