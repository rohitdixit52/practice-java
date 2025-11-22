package CollectionFramework;

// File: WordFrequency.java
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");

        HashMap<String, Integer> freq = new HashMap<>();

        for (String w : words)
            freq.put(w, freq.getOrDefault(w, 0) + 1);

        System.out.println("Word Frequency Count:");
        for (Map.Entry<String, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " → " + e.getValue());
    }
}

