import java.util.*;
public class exampr {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Bhavin");
        list.add("viraj");
        list.add("ravi");
        list.add("viraj");
        list.add("krushang");
        System.out.println(list);
        Set<String> b = new HashSet<>(list);
        System.out.println(b);
        list.toArray();
        System.out.println("array="+b);
        }
    }