public class Main {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Ayush");
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("Ford");
        System.out.println(sb);

        sb.insert(2, "Word");
        System.out.println(sb);

//        sb.reverse();
//        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Hey there");
        System.out.println(sb1);

        sb1.replace(0, 3, "Hi");
        System.out.println(sb1);

        System.out.println(sb1.substring(0, 2));
        System.out.println(sb1);
    }

}
