 class nameofthe3studentconstr {
    String n,m,s;
    int x;
    nameofthe3studentconstr(int a,int b,int c){
        n="bhavin";
        m="ansh";
        s="viraj";
        x=(a+b+c)/3;
    }
    public static void main(String[] args) {
        nameofthe3studentconstr a=new nameofthe3studentconstr(5,5,5);
        System.out.println(a.n);
        System.out.println(a.m);
        System.out.println(a.s);
        System.out.println(a.x);
    }
    
}
