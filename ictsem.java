
    class Subject{
	String name1,name2,name3;
	int marks1,marks2,marks3;
	int average1,average2,average3;
	void details(){
		System.out.println("name :"+name1+ "Percentage: "+marks1+ "average: "+average1);
	}
}
class OOP extends Subject{
	int oopmarks1,oopmarks2,oopmarks3;
	void showooppmarks(){
		System.out.println(name1+"name: "+marks1+"Percrntage:" +average1+"average:"+oopmarks1+"oop marks:");
		System.out.println(name2+"name: "+marks2+"Percrntage:" +average2+"average:"+oopmarks2+"oop marks:");
		System.out.println(name3+"name: "+marks3+"Percrntage:" +average3+"average:"+oopmarks3+"oop marks:");
	}
}
class Maths extends Subject{
	int mathsmarks1,mathsmarks2,mathsmarks3;
	void showmathsmarks(){
		System.out.println(name1+"name: "+marks1+"Percrntage:" +average1+"average:"+mathsmarks1+"maths marks:");
		System.out.println(name2+"name: "+marks2+"Percrntage:" +average2+"average:"+mathsmarks2+"maths marks:");
		System.out.println(name3+"name: "+marks3+"Percrntage:" +average3+"average:"+mathsmarks3+"maths marks:");
	}
}
class VE extends Subject{
	int vemarks1,vemarks2,vemarks3;
	void showvemarks(){
		System.out.println(name1+"name: "+marks1+"Percrntage:" +average1+"average:"+vemarks1+"VE marks:" );
		System.out.println(name2+"name: "+marks2+"Percrntage:" +average2+"average:"+vemarks2+"VE marks:" );
		System.out.println(name3+"name: "+marks3+"Percrntage:" +average3+"average:"+vemarks3+"VE marks:" );
	}
}
class DLD extends Subject{
	int dldmarks1,dldmarks2,dldmarks3;
	void showdldmarks(){
		System.out.println(name1+"name: "+marks1+"Percrntage:" +average1+"average:"+dldmarks1+"DLD marks:");
		System.out.println(name2+"name: "+marks2+"Percrntage:" +average2+"average:"+dldmarks2+"DLD marks:");
		System.out.println(name3+"name: "+marks3+"Percrntage:" +average3+"average:"+dldmarks3+"DLD marks:");
	}
}

class ictsem {
	public static void main(String[] args) {
		Subject superObjSubject=new Subject();

		OOP subObjOOP = new OOP();
		subObjOOP.name1="Krushang";
		subObjOOP.marks1=80;
		subObjOOP.name2="Bhavin";
		subObjOOP.marks2=70;
		subObjOOP.name3="Viraj";
		subObjOOP.marks3=85;

		Maths subObjMaths = new Maths();
		subObjMaths.name1="Krushang";
		subObjMaths.marks1=90;
		subObjMaths.name2="Bhavin";
		subObjMaths.marks2=87;
		subObjMaths.name3="Viraj";
		subObjMaths.marks3=80;
		
		VE subObjVE = new VE();
		subObjVE.name1="Krushang";
		subObjVE.marks1=90;
		subObjVE.name2="Bhavin";
		subObjVE.marks2=75;
		subObjVE.name3="Viraj";
		subObjVE.marks3=70;

		DLD subObjDld = new DLD();
		subObjDld.name1="Krushang";
		subObjDld.marks1=90;
		subObjDld.name2="Bhavin";
		subObjDld.marks2=90;
		subObjDld.name3="Viraj";
		subObjDld.marks3=60;

		int avg1 = (subObjOOP.marks1 + subObjDld.marks1 + subObjMaths.marks1 +subObjVE.marks1)/4;
		int avg2 = (subObjOOP.marks2 + subObjDld.marks2 + subObjMaths.marks2 +subObjVE.marks2)/4;
		int avg3 = (subObjOOP.marks3 + subObjDld.marks3 + subObjMaths.marks3 +subObjVE.marks3)/4;

		int OopAvg = (subObjOOP.marks1+subObjOOP.marks2+subObjOOP.marks3)/3;
		int MathsAvg = (subObjMaths.marks1+subObjMaths.marks2+subObjMaths.marks3)/3;
		int VeAvg = (subObjVE.marks1+subObjVE.marks2+subObjVE.marks3)/3;
		int DldAvg = (subObjDld.marks1+subObjDld.marks2+subObjDld.marks3)/3;

        System.out.println(subObjDld.name1+"  "+"Marks:"+(subObjOOP.marks1 + subObjDld.marks1 + subObjMaths.marks1 +subObjVE.marks1)+ "  " +"Averge: "+avg1);
		System.out.println(subObjDld.name2+"  "+"Marks:"+(subObjOOP.marks2 + subObjDld.marks2 + subObjMaths.marks2 +subObjVE.marks2)+ "  " +"Averge: "+avg2);
		System.out.println(subObjDld.name3+"  "+"Marks:"+(subObjOOP.marks3 + subObjDld.marks3 + subObjMaths.marks3 +subObjVE.marks3)+ "  " +"Averge: "+avg3);
        System.err.println(" ");

		System.out.println("OOP SUBJECT AVERAGE: "+OopAvg);
		System.out.println("MATHS SUBJECT AVERAGE: "+MathsAvg);
		System.out.println("VE SUBJECT AVERAGE: "+VeAvg);
		System.out.println("DLD SUBJECT AVERAGE: "+DldAvg);
	}
}

