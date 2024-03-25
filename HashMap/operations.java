package HashMap;
import java.util.*;
public class operations {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();

        //add
        myMap.put("India", 1000);
        myMap.put("USA", 2000);
        myMap.put("China", 3000);

        System.out.println(myMap);

        //search
        //1. containsKey
        System.out.println(myMap.containsKey("China"));

        //2. containsValue
        System.out.println(myMap.containsValue(1000));

        //get
        System.out.println(myMap.get("India"));

        //size
        System.out.println(myMap.size());

        //iteration
        for(Map.Entry<String, Integer> e : myMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //remove
        myMap.remove("China");

        for(Map.Entry<String, Integer> e : myMap.entrySet()){
            System.out.println(e);
        }

    }
}
