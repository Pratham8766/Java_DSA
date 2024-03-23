package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class operations{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(17);

        System.out.println(set);

        //size
        System.out.println("Length of Set is "+set.size());

        //contains
        System.out.println(set.contains(3));
        System.out.println(set);

        //remove
        set.remove(17);
        System.out.println(set);

        //Iterating a HashSet
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}