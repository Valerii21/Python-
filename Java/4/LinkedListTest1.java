import java.util.*;
 

public class LinkedListTest1 {

    public static void main(String[] args)

    {

        LinkedList<String> linkedli = new LinkedList<String>();

        linkedli.add("Honda");

        linkedli.add("Toyota");

        linkedli.add("Vaz");

        System.out.print("Elements before reversing: " + linkedli);

        linkedli = reverseLinkedList(linkedli);

        System.out.print("\nElements after reversing: " + linkedli);

    }
 
    public static LinkedList<String> reverseLinkedList(LinkedList<String> llist)

    {

        LinkedList<String> revLinkedList = new LinkedList<String>();

        for (int i = llist.size() - 1; i >= 0; i--) {
 

            revLinkedList.add(llist.get(i));

        }

        return revLinkedList;

    }
}