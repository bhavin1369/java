public class additionconst {
    int n1;
    int n2;
    additionconst(int a,int b){
    n1=a;
    n2=b;
}
public static void main(String[] args) {
    additionconst x=new additionconst(3,4);
    System.out.println("n1+n2="+(x.n1+x.n2));
}
}
