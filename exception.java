public class exception {
    public static void main(String[] args) {
        int p=10,q=0,a;
        try{
            a = p/q; 
            System.out.println(a);
        }
        catch(ArithmeticException e){
        System.out.println("error");
    }
    System.out.println("bhavin");
}
}