interface A {
    public void method1();
    public void method2();
    }
    interface B extends A{
        public void method3();
    }
    interface C extends A{
        public void method4();
    }
    class abc implements B{
        public void method1(){
        System.out.println("FOR abc class:");
        System.out.println("hii");
    }
    public void method2(){
        System.out.println("HII!");
    }
    public void method3(){
        System.out.println("Hii!!");
    }
    }
    class bcd implements C{
        public void method1(){
        System.out.println("FOR bcd class:");
        System.out.println("hii");
    }
    public void method2(){
        System.out.println("HII!");
    }
    public void method4(){
        System.out.println("Hii!!");
    }
    }
    public class Interface_Hierachy {
        public static void main(String[] args) {
        abc b=new abc();
        bcd c=new bcd();
        b.method1();
        b.method2();
        b.method3();
        c.method1();
        c.method2();
        c.method4();
        }
        
    }