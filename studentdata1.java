import java.util.*;		
class Details{
	int[] age = new int[10];
	int[] annuleIncome = new int[1000];
	float[] ten = new float[1000];
	float[] twelve = new float[1000];
	String[] firstname = new String[1000] ;
	String[] middlename = new String[1000] ;
	String[] lastname = new String[1000] ;
	String[] male = new String[10];
	String[] mobileNo = new String[1000];
	String[] emailId = new String[1000];
	String[] adderess = new String[1000];
	String[] department = new String[1000];
	String[] cast = new String[1000];
	String[] state = new String[1000];
	String[] city = new String[1000];
	String[] birthDate = new String[1000];
	int p;
	void display(int n){
	}
}
class Name extends Details{
	
	void display(int n) {
	    for(p=1;p<=n;p++){
	    System.out.println();
		System.out.println("	"+p+" Student details: ");
	    //System.out.println();
		System.out.print("The First Name Student " +p+" is : "+firstname[p]);
		System.out.print("\nThe Middle Name Student " +p+" is : "+middlename[p]);
		System.out.print("\nThe Last Name Student " +p+" is : "+lastname[p]);
		System.out.println();
    	}
    }
}

class Age extends Details{
	void display(int n) {
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" age :"+age[p]);
        }
    }
}

class Male extends Details{
    void display(int n){
    for(p=1;p<=n;p++){
        System.out.println("Student "+p+" is Male/Female "+male[p]);
      
        }
    }
}

class MobileNo extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" is Mobile No. : "+mobileNo[p]);
		}
	}
}

class EmailId extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" is Email Id : "+emailId[p]);
		}
	}
}

class Adderess extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+"  Adderess : "+adderess[p]);
		}
	}
}

class Department extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+"  Department : "+department[p]);
		}
	}
}

class TenthResult extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" 10th Result : "+ten[p]);
		}
	}
}

class TwelvethResult extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" 12th Result : "+twelve[p]);
		}
	}
}

class AnnuleIncome extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" Annual Income : "+annuleIncome[p]);
		}
	}
}

class Cast extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" Cast is : "+cast[p]);
		}
	}
}
class State extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" State is : "+state[p]);
		}
	}
}

class City extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" City is : "+city[p]);
		}
	}
}

class BirthDate extends Details{
	void display(int n){
		for(p=1;p<=n;p++){
			System.out.println("Student "+p+" BirthDate is : "+birthDate[p]);
		}
	}
}

public class studentdata1 {
	public static void main(String[] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the how many Student Details:");
		n=sc.nextInt();
		
//class Creat
	Name w=new Name();
	Age a=new Age();
	Male m = new Male();
	MobileNo p = new MobileNo();
	EmailId e = new EmailId();
	Adderess ad = new Adderess();
	Department d = new Department();
	TenthResult t = new TenthResult();
	TwelvethResult tw = new  TwelvethResult();
	AnnuleIncome annule = new AnnuleIncome();
	Cast c = new Cast();
	State s = new State();
	City ci = new City();
	BirthDate bi = new BirthDate();
	
//given by user 
		for(i=1;i<=n;i++){
			System.out.print("Enter the Student " +i+" First Name : ");
			w.firstname[i] = sc.next();
			System.out.print("Enter the Student " +i+" Middle Name : ");
			w.middlename[i] = sc.next();
			System.out.print("Enter the Student " +i+" Last Name : ");
			w.lastname[i] = sc.next();
			
			System.out.print("Enter the Student "+i+" age  : " );
		    a.age[i] = sc.nextInt();
		  
		    System.out.print("Enter the Student "+i+" is Male/Female : ");
		    m.male[i] = sc.next();

			System.out.print("Enter the student "+i+" Mobile No. : ");
			p.mobileNo[i] = sc.next();

			System.out.print("Enter the student "+i+" Email Id : ");
			e.emailId[i] = sc.next();

			System.out.print("Enter the student "+i+" Adderess : ");
			ad.adderess[i] = sc.next();

			System.out.print("Enter the student "+i+" Department : ");
			d.department[i] = sc.next();

			System.out.print("Enter the student "+i+" 10th Result : ");
			t.ten[i] = sc.nextInt();

			System.out.print("Enter the student "+i+" 12th Result : ");
			tw.twelve[i] = sc.nextInt();

			System.out.print("Enter the student "+i+" Annual Income : ");
			annule.annuleIncome[i] = sc.nextInt();

			System.out.print("Enter the student "+i+" Cast : ");
			c.cast[i] = sc.next();

			System.out.print("Enter the student "+i+" State : ");
			s.state[i] = sc.next();

			System.out.print("Enter the student "+i+" City : ");
			ci.city[i] = sc.next();

			System.out.print("Enter the student "+i+" Birth Date : ");
			bi.birthDate[i] = sc.next();

		 }
		 
//return the parameters 
			w.display(n);
			a.display(n);
			m.display(n);
			p.display(n);
			e.display(n);
			ad.display(n);
			d.display(n);
			t.display(n);
			tw.display(n);
			annule.display(n);
			c.display(n);
			s.display(n);
			ci.display(n);
			bi.display(n);

sc.close();
	}	
}