package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.addFirst(5);
        numbers.addLast(40);

        System.out.println("LinkedList after adding: " + numbers);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After removing first & last: " + numbers);

        System.out.println("Peek (head): " + numbers.peek());
       // To Remove head in the given list
        System.out.println("Poll (remove head): " + numbers.poll());
        System.out.println("After Poll: " + numbers);
    }
}
