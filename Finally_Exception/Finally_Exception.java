// finally Block is a block which always executes whether exception came or not
// Good Practice to use finally block to include important cleanup code

public class Finally_Exception {
    public static void main(String args[]) {
        int a[] = new int[5];
        try {
            System.out.println(a[8]);
        } catch (Exception e) {
            System.out.println("Tried to access the out of bound element");
        } finally {
            System.out.println("Finally Block will always execute");
        }
    }
}