/* Collection Framework: Set -> 1. HashSet
1. It cannot allow duplicate elements
2. Used to reduce time complexity in programming
3. Time Complexity: 1. insert/add : O(1)
                    2. delete/remove : O(1)
                    3. search/contain : O(1)
4. Hashsets are unordered
*/

import java.util.*;
public class HashSets {
    public static void main(String args[]) {
        // Creation of HashSet
       HashSet<Integer> set = new HashSet<>();

       // Insert Element
        set.add(5);
        set.add(1);
        set.add(2);
        set.add(9);
        set.add(3);
        set.add(56);
        set.add(4);
        set.add(1);
        System.out.println(set);

        // Search - contains
        if(set.contains(1)) {
            System.out.println("Set Contains 1");
        }

        if(!set.contains(6)) {
            System.out.println(("Set not contains 6"));
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Does not contains 1 - WE deleted 1");
        }

        // Size
        System.out.println("Size of set is :"+set.size());

        // Print all elements
        System.out.println(set);

        // Iterator
        // 1. next(): Point to next element
        // 2. hasNext(): return true or false
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
