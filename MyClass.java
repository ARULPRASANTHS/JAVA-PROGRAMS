public class MyClass {
    String name;
    MyClass(String name) {
        this.name = name;
        System.out.println("Created: " + name);
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }
}

class ObjectLifecycleDemo {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Object1");
        MyClass obj2 = new MyClass("Object2");
        obj2 = obj1;
        obj1 = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



/* output   

Created: Object1
Created: Object2
Garbage collected: Object2
 
*/