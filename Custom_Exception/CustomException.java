// throw keyword is used to explicitely throw a single exception
import java.util.Scanner;
public class CustomException {
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");

        try{
            int age = sc.nextInt();
            if(age > 100){
                throw new MyException();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class MyException extends Exception {

}