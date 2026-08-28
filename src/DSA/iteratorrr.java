package DSA;

import java.util.*;

public class iteratorrr {
    public static void main(String args[]) {

        ArrayList<String> al = new ArrayList<>();

        al.add("bahubali");
        al.add("devasena");
        al.add("battala");
        al.add("bijjaladeva");

        System.out.println(al);

        ListIterator<String> als = al.listIterator();

        while (als.hasNext()) {

            String movie = als.next();
            System.out.println(movie);

            if (movie.equals("bahubali")) {
                als.set("devasena");
            }
        }

        System.out.println("After replace");

        for (String movie : al) {
            System.out.println(movie);
        }

        System.out.println("Traversing in reverse order:");

        while (als.hasPrevious()) {
            System.out.println(als.previous());
        }
    }
}