package JAVA8Features;

import java.util.List;

public class StreamAverage {
    public static void main(String[] args) {
        List<Integer> marks = List.of(80,70,90,60);

        double avg = marks.stream().mapToInt(n-> n).average().orElse(0);

        System.out.println("Average marks is : " + avg);
    }
}
