/* Collection Framework: Set -> 3. TreeSet
   1. It cannot allow duplicate elements
   2. Used to reduce time complexity in programming
   3. It Prints elements in sorted order
 */
import java.util.*;
public class TreeSets {
    public static void main(String args[]) {
        // Creation
        TreeSet<Integer> set = new TreeSet<>();

        // Insert element
        set.add(87);
        set.add(12);
        set.add(2);
        set.add(34);
        set.add(56);
        set.add(1);
        set.add(89);
        System.out.println(set);

        // Size
        System.out.println(set.size());

        // Search: contains
        if(set.contains(34)) {
            System.out.println("Element is present");
        }

        if(!set.contains(90)) {
            System.out.println("Element not present");
        }

        // Remove element
        set.remove(12);
        System.out.println(set);

        // Check set empty or not
        System.out.println(set.isEmpty());

        // Iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
