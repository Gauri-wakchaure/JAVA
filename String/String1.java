import java.util.Scanner;
public class String1 {
    public static void main(String args[]) {
        // String Declaration
        String name = "Gauri";
        String fulName = "Gauri wakchaure";
        String sentence = "I am Software Developer";

        // Take String from user
        //next() is used to take single word as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name1 = sc.next();
        System.out.println("Your name is: "+ name1);

        // nextLine() is used to take sentence as input
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Your Full Name: ");
        String name2 = sc1.nextLine();
        System.out.println("Your full name is: "+ name2);
    }
}
