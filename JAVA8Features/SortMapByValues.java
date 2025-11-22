package JAVA8Features;

import java.util.Map;

public class SortMapByValues {
    public static void main(String[] args) {
        Map<String, Integer> marks = Map.of("Rohit", 85, "Sachin", 92, "Ramesh", 87);
        marks.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .forEach(e-> System.out.println(e.getKey()+"  " +" ->" + "  " + e.getValue()));
    }
}
