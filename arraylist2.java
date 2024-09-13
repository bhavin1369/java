import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ansh");
        list.add("Bhavin");
        list.add("Viraj");
        list.add("Krushang");
        for(String s1:list)
        System.out.println(s1);
        list.remove("Bahvin");
        for(String s2:list)
        System.out.println(s2);
        
    }
}
