package org.amigos_data_structures_1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheLinkedListQueue {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Maria", 22));
        queue.add(new Person("Ali", 23));

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Maria", 22));
        linkedList.addFirst(new Person("Ali", 23));
        System.out.println();

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while(personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
