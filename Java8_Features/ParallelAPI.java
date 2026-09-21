import java.util.*;

public class ParallelAPI {
    public static void main(String args[]) {
              
        /* Java 8 : 4th feature Parallel Streams
        1. In this multiple streams present are work in a parallel way
        2. It is Most important feature of Java 8
        3. It works in a Parallel way
        4. When data is big but it is unordered
        5. Easy Performance Boost
         */

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list1.parallelStream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n>5)
                .forEach(System.out::println);
    }
}