package ArrayList;
import java.util.ArrayList;
public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Add
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //Get
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //size
        System.out.println(list.size());

        //add in between
        list.add(3,3);
        System.out.println(list);

        //set or modify
        list.set(0, 10);
        System.out.println(list);

        //delete
        list.remove(0);
        System.out.println(list);
    }
}
