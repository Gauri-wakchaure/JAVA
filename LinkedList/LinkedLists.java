/* Collection Framework: List -> 2. LinkedList

1. Store elements in a non-continuous form
2. Time complexity: 1.insert : O(1)
                 2. search : O(n)
3. Variable size that means we add multiple elements in it
4. In this we store elements in nodes
5. First node called as head node
6. Types: 1. Single 2. Double 3. Circular
*/

import java.util.*;
public class LinkedLists {
    public static void main(String args[]) {
       LinkedList<String> list = new LinkedList<String>();

       // Add elements at first index
       list.addFirst("a");
       list.addFirst("is");
        System.out.println(list);

        // Add elements at last index
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        // Check Size
        int size = list.size();
        System.out.println(size);

        // Loop in Linked list
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i)+ " -> ");
        }
        System.out.println("null");

        // Remove First element
        list.removeFirst();
        System.out.println(list);

        // Remove Last Element
        list.removeFirst();
        System.out.println(list);

    }
}
