// Use Throws keyword in method declaration to declare type of exceptions that might occur within it
public class Throws_Keyword {
    public static void main(String args[]) {
        int a[] = new int[5];

        try {
            getNumberFromArray(a);
        } catch (Exception e) {
            System.out.println("Catch the exception " + e.getMessage());
        }
    }
        public static int getNumberFromArray(int a[]) throws ArithmeticException{
            return a[8];
        }
}s

