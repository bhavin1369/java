interface A {
    public void name();

    public void name2();
}

interface B extends A {
    public void name3();

}

interface C extends A {
    public void name4();
}

class Class1 implements B {
    public void name() {
        System.out.println("Darshan");
    }

    public void name2() {
        System.out.println("Meet");
    }

    public void name3() {
        System.out.println("Yash");
    }
}

class Class2 implements C {
    public void name() {
        System.out.println("Darshan Bhnaderi");
    }

    public void name2() {
        System.out.println("Meet Limbani");
    }

    public void name4() {
        System.out.println("OM");
    }
}

public class darshan {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        c1.name();
        c1.name2();
        c1.name3();

        Class2 c2 = new Class2();
        c2.name();
        c2.name2();
        c2.name4();
    }
}   

