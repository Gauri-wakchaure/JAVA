import java.util.Scanner;
/* Array: Collection of Similar data types
   Array index in java starts from 0th index */

public class Array {
    public static void main(String[] args) {
        // Defining an array
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 89;
        marks[2] = 90;
        /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]); */

        // Print Array using Loop
        /* for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }

        // Another Method to define array
        int values[] = {12, 45, 57, 37,89,90};
        for(int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        } */

        // Define array and take input from user
        // In below example we use linear search to search element
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        //Input
        for(int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.print("Enter searching element : ");
        int x = sc.nextInt();

        //Output
        for(int i=0; i<number.length; i++) {
            if(number[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}