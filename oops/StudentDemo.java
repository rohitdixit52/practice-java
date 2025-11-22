package OOPS;
class Student{
    int id;
    String name;
    String course;

    Student(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;

    }
    void showDetails(){
         System.out.println("ID: " + id + "  " + "Name :" + " " + name + "  " + " Course" + "  " + course);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Sachin", "M.tech");
        Student s2 = new Student(101, "Mohit", "M.tech");
        s1.showDetails();
        s2.showDetails();
    }
}
