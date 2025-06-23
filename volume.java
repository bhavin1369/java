class A{
	int r;
	void showr(){
		System.out.println("radius of cylinder"+r);
	}
}
class B extends A{
	int h;
	void showh(){
		System.out.println("hieght of cylinder:"+h);
	}
}
class C extends B{
	void volume(){
			System.out.println("Volume of Cylinder: "+(3.14*r*r*h));
	}
}
     
     class volume {
	public static void main(String[] args) {
		A superObjA = new A();
		superObjA.r=5;
		superObjA.showr();
		B subObjB =new B();
		subObjB.h=10;
		subObjB.showh();
		C subObjC =new C();
		subObjC.r=5;
		subObjC.h=10;
		subObjC.volume();
	}

}


