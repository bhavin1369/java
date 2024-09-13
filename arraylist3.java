import java.util.*;
public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.ensureCapacity(5);
        list.add("Bhavin");
        list.add("viraj");
        list.add("ansh");
        list.add("krushang");
        list.add("vijay");
        list.add("ajay");
        list.add("raj");
        list.add("shivam");
        list.add("rajvi");
        list.add("divy");
        System.out.println(list);
        String str = list.get(1);
    System.out.println("Element at index 1: " + str);
    list.set(2, "JavaScript");
    System.out.println("Modified ArrayList: " + list);
    String str1 = list.remove(2);
    System.out.println("Updated ArrayList: " +list);
    System.out.println("Size of the ArrayList: " + list.size());
    System.out.println("contains:"+list.contains("Bhavin"));
    System.out.println("index ="+list.indexOf("shivam"));
    //Collection.sort(list);
    list.sort(Comparator.naturalOrder());
    System.out.println("sublist="+list.subList(1,4));
    System.out.println("sorted:"+list);
    System.out.println("Is arraylist empty? " + list.isEmpty());
    list.clear();
    System.out.println("Is arraylist empty? " + list.isEmpty());
    }
}