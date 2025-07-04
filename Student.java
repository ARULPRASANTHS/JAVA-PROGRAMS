 public class Student {
    String name;
    int age;
    double grade;

    void setStudentDetails(String studentName, int studentAge, double studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }


    

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentDetails("Alice", 20, 85.5);
        student.displayDetails();
    
    }
}


/*
 
Name: Alice
Age: 20
Grade: 85.5

 */
    

