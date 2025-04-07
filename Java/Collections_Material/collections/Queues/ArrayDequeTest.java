package collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		Deque<Character> arrayDeque = new ArrayDeque<Character>();
		arrayDeque.push('A');
		arrayDeque.push('B');
		arrayDeque.push('C');
		arrayDeque.push('D');
		arrayDeque.push('E');
		arrayDeque.push('F');
        
        System.out.println(arrayDeque.peek()); 	// reads the head element == peekFirst()
        System.out.println(arrayDeque.element());// reads the head element == peekFirst()
        System.out.println(arrayDeque.pop());  	// reads and removes the first element of this deque. = removeFirst()
        System.out.println(arrayDeque.poll()); 	// reads and removes the head element = pollFirst()
        System.out.println(arrayDeque.remove()); // reads and removes the head element = pollFirst()
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.pop());
        
        System.out.println(arrayDeque);

	}

}
