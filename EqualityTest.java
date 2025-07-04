import java.util.*;
public class EqualityTest {
    public static void main(String[] args) {
      
        String str1 = "Hello"; 
        String str2 = "Hello"; 
        String str3 = new String("Hello"); 

        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1 == str3: " + (str1 == str3)); 

        
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 

     
        Integer num = 123;
        System.out.println("str1.equals(num): " + str1.equals(num)); 
    }
}


/*        output 
          str1 == str2: true
          str1 == str3: false
          str1.equals(str2): true
          str1.equals(str3): true
          str1.equals(num): false 
*/