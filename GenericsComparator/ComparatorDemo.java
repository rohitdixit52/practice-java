package GenericsComparator;

import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class SortByName implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return a.name.compareTo(b.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(103, "Amit"));
        list.add(new Employee(101, "Rohit"));
        list.add(new Employee(102, "Priya"));

        Collections.sort(list, new SortByName());

        System.out.println(list);
    }
}

