package GenericsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

public int compareTo(Student s){
    return this.rollNo - s.rollNo; // ascending order

}
 
    public String toString(){
        return rollNo + "  - " + name;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
         List<Student> list = new ArrayList<>();
        list.add(new Student(103, "Amit"));
        list.add(new Student(101, "Rohit"));
        list.add(new Student(102, "Priya"));

        Collections.sort(list);
        System.out.println(list);
    }
}
