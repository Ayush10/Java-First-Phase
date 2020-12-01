package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Ayush");
        ll.add("Nisha");
        ll.add("Rahul");
        ll.add("Hira");

        ll.add(2, "Ojha");
        ll.add(4, "Ojha");

        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Rolls Royace");
        l1.add("BMW");
        l1.add("Lambourgini");
        l1.add("Tesla");

        ll.addAll(l1);

        ll.addFirst("First Name");
        ll.addLast("Car Name");

        ll.addFirst("RamChandra");

        ll.remove("RamChandra");
        ll.remove(0);
        ll.remove(10);

//        ll.clear();

        Iterator<String> i = ll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
