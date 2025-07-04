import java.util.*;
public class Square{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number:");
    int number = scanner.nextInt();
    int square = number * number;
    System.out.println("Square of " + number+ " is: " + square);
      scanner.close();
    }
}


/*
 Enter a number: 34
 Square of 34 is: 1156
 */