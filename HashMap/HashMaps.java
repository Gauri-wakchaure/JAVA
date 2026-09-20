/* Collection Framework: Map -> 1. HashMap
1. Used to store data in key-value pair
2. Unique keys are used
3. Unordered Map
*/
import java.util.*;
public class HashMaps {
    public static void main(String args[]) {
        // Creating HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert : Use Put
        map.put("India",120);
        map.put("USA",100);
        map.put("China",150);

        System.out.println(map);

        // Search
        if(map.containsKey("USA")){
            System.out.println("Key is present in map");
        }else{
            System.out.println("Key is not present in a map");
        }

        // Get
        System.out.println(map.get("China"));  //Key exists
        System.out.println(map.get("Russia"));  //Key Doesn't exist

        // Iteration in HashMap
        int array[] = {12, 45, 78};
        for(int i=0; i<3; i++) {
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
        map.remove("China");
        System.out.println(map);

    }
}
