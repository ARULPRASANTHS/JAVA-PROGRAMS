import java.util.ArrayList;
import java.util.Scanner;

public class Simple{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fruit name: ");
        String userFruit = scanner.nextLine();

        fruits.add(userFruit);
        System.out.println("Fruits in the list: " + fruits);

        scanner.close();
    }
}



/* output
Enter a fruit name: orange
Fruits in the list:[Apple, Banana, Orange]
*/