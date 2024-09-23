import java.util.*;

public class examppr1 {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("apple"); 
        a.add("banana"); 
        Set<String> uniqueElements = new HashSet<>(a);
        a.clear();
        a.addAll(uniqueElements);
        for (String element : a) {
            System.out.println(element);
        }
    }
}