import java.util.*;
public class OperatorPresedence{
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        int result;

        
        result = a + b * c; 
        System.out.println("Without parentheses: " + result);

     
        result = (a + b) * c; 
        System.out.println("With parentheses: " + result);
    }
}

/* output   
Without parentheses: 11
With parentheses: 16 */