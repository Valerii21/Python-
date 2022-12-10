// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Iterator;

public class J6<Item> implements Iterable {
    private class QueueIterator implements Iterator {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Object next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {
            // blank
        }
    }

    public Iterator iterator() {
        return new QueueIterator();
    }

    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private Node last;
    private int n;

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    public void enqueue(Item item) {
        Node old = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            old.next = last;
        }
        n++;
    }

    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (n == 1) {
            last = null;
        }
        n--;
        return item;
    }

    public static void main(String[] args) {
        J6<String> queue = new J6<String>();
        String exp = "a b c d e f";
        String[] split = exp.split(" ");
        for (String s : split) {
            if (!s.equals("-")) {
                queue.enqueue(s);
            } else if (!queue.isEmpty()) {
                String dequeue = queue.dequeue();
                System.out.print(dequeue + " ");
            }
        }
        System.out.println();
        System.out.println(queue.size());
        for (Object ele : queue) {
            System.out.print(ele + " ");
        }
    }
}