public class Constructor {
    public static void main(String[] args){

       /* Parametrized Constructor called
       Student s1 = new Student("Gauri", 22);
       s1.printName(); */

        Student s1 = new Student();
        s1.name = "Gauri";
        s1.age = 24;

        /*  Copy Constructor called
        Student s2 = new Student(s1);
        s2.printName(); 
        */

    }
}

// Student Class
class Student{
     String name;
     int age;

public void printName() {
    System.out.println(this.name);
    System.out.println(this.age);
}

/* 1. Constructor is a special type of method which automatically created at the time of object creation
   2. It has to return type
   3. Constructor called only once
   4. It has types: 1. Parameterized
                    2. Non-Parameterized */

// Non-Parametrized Constructor
/* Student() {
 System.out.println("Constructor called");
 }
 */

 /* Parametrized Constructor
 Student(String name, int age) {
 this.name = name;
 this.age = age;
  } */

 // Copy Constructor
Student(Student s2) {
this.name = s2.name;
this.age = s2.age;
}
Student() {

 }
}


