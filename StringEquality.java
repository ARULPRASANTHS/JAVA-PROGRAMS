import java.util.*;
public class StringEquality {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        if (s1 == s2) {
            System.out.println("s1 == s2: Same object");
        }

        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2): Same content");
        } else {
            System.out.println("s1.equals(s2): Different content");
        }

        
        String result = s1.equals(s2) ? "Match" : "No match";
        System.out.println("Ternary result: " + result);
    }
}


/*  output

s1.equals(s2): Same content
Ternary result: Match

 */