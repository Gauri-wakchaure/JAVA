/* Static Keyword is used to make common properties Static
 In this every object has same School name Property
 Static stores memory */
 
class Student1 {
    String name;
    static String school;
}
public class Static_Keyword {
    public static void main(String[] args) {
        Student1.school = "COEP";
        Student1 stud = new Student1();
        stud.name = "Gauri";
        System.out.println(stud.school);
    }
}
