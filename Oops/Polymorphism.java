public class Polymorphism {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Gauri";
        s1.age = 24;


        s1.printName(s1.name);

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

            //Polymorphism: One work done by multiple ways
            //2 Types: Compile-time and Runtime Polymorphism:
            // Method Overloading: Same method name with different parameters
            public void printName(String name) {
                System.out.println(name);
            }

            public void printName(int age) {
                System.out.println(age);
            }

            public void printName(String name, int age) {
                System.out.println(name+" "+age);
            }
        }
