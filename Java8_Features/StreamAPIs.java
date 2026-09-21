import java.util.*;

public class StreamAPIs {
    public static void main(String args[]) {

        /* Stream API: Java 8 feature 3rd Feature
        1. Reduce Boilerplate code
        2. Cleaner code
        3. Easily Understandable
        4. Use Stream API instead of nested conditions
           to reduce code complexity
        5. It is sequential
        6. Process data like a pro
        */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}