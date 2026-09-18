import java.util.Scanner;

//2D Array: Collection of rows and columns
public class TwoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] TwoDArray = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                TwoDArray[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print 2D Array");
        //output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter Element you want to search: ");
        int x = sc.nextInt();

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                //Search Element
                if(TwoDArray[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }
    }
}
