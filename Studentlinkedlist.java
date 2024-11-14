import java.util.*;
public class Studentlinkedlist {
    public static void main(String[] args) {
     LinkedList<String> a=new LinkedList<String>();  
     a.add("Viraj");
     a.add("Ansh");
     a.add("Bhavin");
     a.add("A");
     a.add("B");
     a.add("C");
     a.add("D");
     a.add("E");
     a.add("F");
     a.add("G");
     System.out.println(a);
     String str = a.get(1);
    System.out.println("Element at index 1: " + str);
    a.set(2, "JavaScript");
    System.out.println("Modified ArrayList: " + a);
    String str1 = a.remove(2);
    System.out.println("Updated ArrayList: " +a);
    System.out.println("Size of the ArrayList: " + a.size());
    System.out.println("contains:"+a.contains("Bhavin"));
    System.out.println("index ="+a.indexOf("A"));
    a.sort(Comparator.naturalOrder());
    System.out.println("sublist="+a.subList(1,4));
    System.out.println("sorted:"+a);
    System.out.println("arraylist Is empty? " + a.isEmpty());
    a.clear();
    System.out.println("arraylist Is empty? " + a.isEmpty());

    System.out.println("ArrayList: " + a);
    String[] arr=new String[a.size()];
    a.toArray(arr);
    System.out.println(arr);







    
    // convert ArrayList to String
}
}