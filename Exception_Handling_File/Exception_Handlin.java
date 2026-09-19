/* Types of Exceptions:
1. Runtime Exception :
- Also called Unchecked Exception
- Cause due to programming fault
- EX: Null Pointer, Array index of bound, Arithmetic
- Above exceptions parent class is Runtime Exception
2. Compile Time Exception
- Also called checked Exceptions
- Checked by Compiler
- EX: File not found,
 */
// Try-Catch: Block Which is use to handle Exceptions and prevent abnormal termination of program
// We can also add multiple catch blocks in try catch block
public class Exception_Handling {
    public static void main(String args[]) {

        int a[] = new int[5];
        try {
            System.out.println(a[8]);
        } catch (Exception e) {
            System.out.println("Tried to access the out of bound element");
        }
    }
}