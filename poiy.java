class add{
    void add_show(int a){
        int i=a;
        System.out.println("i="+i);
    }
    void add_show(int a,int b){
        int i=a;
        int j=b;
        System.out.println("i+j"+(i+j));
    }
    void add_show(int a,int b,int c){
        int i=a;
        int j=b;
        int k=c;
        System.out.println("i+j+c="+(i+j+k));
    }
}
public class poiy{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.add_show(10);
    }

}