/* Collection Framework: List -> 1. ArrayList

   1. In array data store in continues form
   2. Array has fixed size
   3. In this we only store primitive data-types
   4. Time complexity: 1.insert : O(n)
                       2. search : O(1)
   ArrayList: In this elements store in non-continuous form
               in arraylist we can store only objects
   Methods: 1.add 2.remove 3.iterator 4.size 5.get 6.set
*/
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();

       // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1,1);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
