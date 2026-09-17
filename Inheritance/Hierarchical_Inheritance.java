public class Hierarchical_Inheritance {

    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
    }
}

class Shape2 {
    public void area() {
        System.out.println("Display Area");
    }
}

// Define inheritance using extend keyword
// Child Classes
class Triangle2 extends Shape2 {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape2 {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
