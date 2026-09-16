public class try_catch {

public static void main(String[] args) {
        // Exception: We can handle exceptions which we can handle by using try & catch block
        // We cannot handle errors
        // Try-Catch Block
        int [] marks1 = {34, 45,67,89,90};
        try {
            System.out.println(marks1[7]);
        }catch(Exception exception){
            System.out.println("Array index is Wrong");
        }
        System.out.println("Hello");
    }
}