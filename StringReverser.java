public class StringReverser {
        public static void main(String[] args) {
            String originalString = "hello"; 
            String reversedString = new StringBuilder(originalString).reverse().toString();
            
            System.out.println("Original String: " + originalString);
            System.out.println("Reversed String: " + reversedString);
        }
    }