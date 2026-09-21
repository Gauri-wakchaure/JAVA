/*  JAVA 8 Features:

 Real- Industry powers mostly used java-8 features
 Spring-boot, Microservices, backend APIs,
 Data Processing, Cloud Applications, Enterprise Banking Projects
 1. Lambda Expression
 2. Functional Interface
*/

    /*  Functional Interface
    It is a interface that contains exactly one abstract(unimplemented)
    method making it suitable for use with lambda expression & method reference
    - Functional interface conditions:
    1. It must have exactly one abstract method
    2. multiple default methods
    3. multiple static methods
    4. It should have @FunctionalInterface on it.
    5. @FunctionalInterface: Annotation which indicated an interface is a
       Functional interface
       - it ensures at compile time that interface contains exactly
         one abstract method
     */

@FunctionalInterface
interface Calculator1 {
    int add(int a, int b);
}
public class FunctionalInterface1 {
    public static void main(String args[]) {

        Calculator1 calc = (a,b) ->a+b;
        System.out.println(calc.add(65,80));

        Runnable r = () -> System.out.println("Hello World");
        r.run();
    }
}
