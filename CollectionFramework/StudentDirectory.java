package CollectionFramework;
import java.util.*;

class Student {
    int roll;
    String name;
    String course;

    Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return roll + " - " + name + " (" + course + ")";
    }
}

public class StudentDirectory {
    public static void main(String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();

        // Add students
        students.put(101, new Student(101, "Rohit", "MCA"));
        students.put(102, new Student(102, "Aman", "BCA"));
        students.put(103, new Student(103, "Neha", "MSc"));

        System.out.println("\nAll Students:");
        students.forEach((k, v) -> System.out.println(v));

        // Search
        int searchRoll = 102;
        System.out.println("\nSearched: " + students.get(searchRoll));

        // Update
        students.put(103, new Student(103, "Neha", "MBA"));

        // Remove
        students.remove(101);

        System.out.println("\nAfter Update/Remove:");
        students.forEach((k, v) -> System.out.println(v));
    }
}
