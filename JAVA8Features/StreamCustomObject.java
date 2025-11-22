package JAVA8Features;

import java.util.List;
import java.util.stream.Collectors;

class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks= marks;
    }
}
public class StreamCustomObject {
    public static void main(String[] args) {
        List<Student> list = List.of(
             new Student("Rohit", 85),
            new Student("Aman", 70),
            new Student("Neha", 92)
        );
        List<String> toppers = list.stream()
        .filter(s-> s.marks > 80)
           .map(s -> s.name)
                                   .collect(Collectors.toList());

                                   System.out.println(toppers);
    }
}
