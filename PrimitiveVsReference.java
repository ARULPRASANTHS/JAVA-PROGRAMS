public class PrimitiveVsReference {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        y = 20;
        System.out.println("Primitive example:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1;
        sb2.append(" World");
        System.out.println("\nReference example:");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
    }
}


/* 

Primitive example:
x = 10
y = 20

Reference example:
sb1 = Hello World
sb2 = Hello World

*/