import java.util.Scanner;
public class Scanner {

public static void main(String[] args) {

    // How to take INPUT?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age2 = sc.nextInt();
        System.out.println(age2);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String nameValue = sc1.next();
        System.out.println(nameValue);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Something about you...");
        String Something = sc2.nextLine();
        System.out.println(Something);
    }
}