import java.util.*;
public class Linklist1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Bhavin");
        list.add("vijay");
        list.add("ravi");
        System.out.println(list);
        list.remove("vijay");
        System.out.println(list);
        list.addFirst("first");
        list.addLast("last");
        System.out.println(list);
        
    }
}
