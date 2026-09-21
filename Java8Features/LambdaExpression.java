// JAVA 8 Features:
// 1. Lambda Expression
// 2. Functional Interface

@FunctionalInterface
interface Calculator1 {
    int add(int a, int b);
}
public class LambdaExpression {
    public static void main(String args[]) {

        /* Lambda Expression
         1. it is a concise way to represent an implementation of a functional interface
            using a short, readable syntax
         2. 0 -> { /* Implementation here  }
         3. Used to reduce boilerplate code
         4. To use lambda expression we must have to use power of
            Functional interface
         5. Cleaner Code
         6. Cannot add lambda expression without functional interface
         */

        Calculator1 calc = (a,b) ->a+b;
        System.out.println(calc.add(65,80));

        Runnable r = () -> System.out.println("Hello World");
        r.run();
    }
}
