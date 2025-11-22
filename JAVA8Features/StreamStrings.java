package JAVA8Features;

import java.util.List;
import java.util.stream.*;


public class StreamStrings {
    public static void main(String[] args) {
        List<String> names  = List.of("Sachin", "Rohit", " Vipin", "Reena");
        List<String> upperNames = names.stream() 
        .map(String :: toUpperCase)
        .filter(n-> n.startsWith("R"))
        .collect((Collectors.toList()));

        System.out.println("Filtered names : " + upperNames);
    }
}
