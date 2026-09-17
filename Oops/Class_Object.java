public class Class_Object {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color ="black";
        pen2.type ="bullpoint";

       pen1.printColor();
       pen2.printColor();


        Student s1 = new Student();
        s1.name = "Gauri";
        s1.age = 24;

    }
}

/* Class: It is a collection of objects
           Object: It is a blueprint of class */
        // Pen Class
        class Pen{
            String color;
            String type;

            // Functions which are written in class called as Methods
            public void write(){
                System.out.println("Writing Something");
            }
            public void printColor(){
                System.out.println(this.color);
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
        }

