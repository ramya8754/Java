import java.util.*;
public class collectionEx1 {
    public static void main(String[] args) {
        System.out.println("Stack = LIFO");

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
 
        System.out.println("Queue = FIFO");

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("X");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println("Deque = FIFO , LIFO");

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offer("A");
        deque.offer("B");
        deque.offer("C");
        deque.offerFirst("X");
        deque.offerLast("Z");
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.peek());
        System.out.println(deque);


    }
}