import java.util.*;

interface Blueprint {
    int fun(int a, int b);

    int fun2(int a, int b);

    static void fun3() {
        System.out.println("This is a static method");
    }
}
public class InterfaceMethods {
    public static void main(String args[]) {

       /* Java 8 : 6th Feature : Default & Static Methods in interface
        1. Before in java interface has only methods not body
           but in Java 8 methods can have body using default
           and static
         */

           Blueprint.fun3();
        }
    }
