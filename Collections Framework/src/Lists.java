import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

    public static void main(String[] args) {

        List<String> l = new ArrayList<String>();

        l.add("Ayush");
        l.add("Nisha");
        l.add("Rahul");
        l.add("Hira");
        l.add(0, "Important Names");
        l.add(1, "For Removing");
        l.add(2, "Another one to Remove");

        l.remove("For Removing");
        l.remove(1);

        System.out.println(l.get(1));
        System.out.println(l.get(4));

        ListIterator li = l.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }
}
