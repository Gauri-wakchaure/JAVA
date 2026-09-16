import java.util.Arrays;

public class array{

public static void main(String[] args) {
/* Array: It is used to store collection of similar data elements
           It is a data structure
           Represented in Square brackets [] */
        int eng = 97;
        int hin = 96;
        int mar = 95;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 95;

        //length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //Initialize Array Directly Using Curly brackets
        int[] marksofStudent = {65, 74,98,30,90};

        // 2D Array
        int[][] finalmarks = {{45,67,78}, {87,90,54}};
        System.out.println(finalmarks[1][1]);
   }
}