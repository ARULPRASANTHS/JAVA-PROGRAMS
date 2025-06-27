public class Example {
    int num = 50;

    public static void main(String[] args) {
        Example obj = new Example();  
        obj.show();         
    }          

    public void show() { 
        int num =10;           
        System.out.println(num);        
        System.out.println(this.num);   
}
}

/*
Output:
    10
    50
 */