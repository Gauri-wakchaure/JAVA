public class Multilevel_Inheritance {

    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
    }
}

// Parent class
// Multilevel Inheritance
// In this it inherits its previous class
class Shape1 {
    public void area() {
        System.out.println("Display Area");
    }
}

// Define inheritance using extend keyword
// child class
class Triangle1 extends Shape1 {
      public void area(int l, int h){
          System.out.println(1/2*l*h);
      }
}

class EquilateralTriangle extends Triangle1 {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
