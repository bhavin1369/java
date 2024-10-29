import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("Viraj");
        stack.push("Ansh");
        stack.push("Kaushal");
        stack.push("Bhavin");
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("Viraj"));
        System.out.println(stack.empty());
        stack.clear();
        System.out.println(stack.empty());
    }
}