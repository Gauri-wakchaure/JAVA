/* Collection Framework: Map -> 3. TreeMap
1. Used to store data in key-value pair
2. Unique keys are used
3. It Gives Sorted Values
*/
import java.util.*;
public class TreeMaps {
    public static void main(String args[]) {
        // Creating HashMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Insert : Use Put
        map.put("India",120);
        map.put("USA",100);
        map.put("Paris",123);
        map.put("Ladakh",789);
        map.put("China",150);
        map.put("Indonesia",454);

        System.out.println(map);

        // Search key
        if(map.containsKey("Paris")){
            System.out.println("Key is present in map");
        }else{
            System.out.println("Key is not present in a map");
        }

        // Get Key
        System.out.println(map.get("China"));  //Key exists
        System.out.println(map.get("Russia"));  //Key Doesn't exist

        // Iteration in HashMap
        int array[] = {12,76, 45, 78, 4, 34};
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for(int val: array) {
            System.out.print(val+" ");
        }
        System.out.println();

        // Get Key: Value Pair
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Get only Keys
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }

        // remove
        map.remove("Ladakh");
        System.out.println(map);

    }
}

