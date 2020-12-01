package arraylist;

import arraylist.Car;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car(20000, "3Series", "BMW");
        Car c2 = new Car(30000, "5Series", "BMW");
        Car c3 = new Car(40000, "7Series", "BMW");

        ArrayList<Car> c = new ArrayList<Car>();
        c.add(c1);
        c.add(c2);
        c.add(c3);

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).brand + " " + c.get(i).name + " " + c.get(i).price);
        }

        for (Car d : c) {
            System.out.println(d.brand + " " + d.name + " " + d.price);
        }

//        ArrayList<String> l1 = new ArrayList<String>();
//
//        l1.add("Cat");
//        l1.add("Jaguar");
//        l1.add("Dog");
//
//        Iterator i = l1.iterator();
//        while (i.hasNext()) {
//            System.out.println(i.next());
//        }

//        l1.remove("Dog");

//        System.out.println(l1.size());
//
//        System.out.println(l1.get(0));
//
//        String s[] = new String[l1.size()];
//        s = l1.toArray(s);
//
//        for (String checking: s) {
//            System.out.println(checking);
//        }
//
//        l1.set(1, "Cheetah");
//        System.out.println(l1.get(1));
//
//        if (l1.contains("Jaguar")) {
//            System.out.println("Present");
//        } else {
//            System.out.println("Not Present");
//        }
//
//        for (String list : l1) {
//            System.out.println(list);
//        }
    }
}
