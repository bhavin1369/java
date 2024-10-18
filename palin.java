import java.util.Scanner;

public class palin {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String x ;
            System.out.println("enter string:");
            x=sc.nextLine(); 
            System.out.println("'"+ x + "'is a palindrome=" + isPalindrome(x));
        }
        public static boolean isPalindrome(String s) {
            int l = 0;
            int r = s.length() - 1;
    
            while (l < r) {
                if (s.charAt(l) != s.charAt(r)) {
                    return false; 
                }
                l++;
                r--;
            }
            return true; 
        }
    }
