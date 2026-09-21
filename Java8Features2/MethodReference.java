import java.util.*;

public class MethodReference {
    public static void main(String args[]) {

      /* Java 8 : 4th feature Method Reference
         1. It is another feature of Java 8
         2. Represent as: .forEach(System.out::println);
         3. Use Insted if Lambda Expression
          */

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
         
        }
    }
