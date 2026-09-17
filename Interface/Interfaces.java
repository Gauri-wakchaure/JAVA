public class Interfaces {
    public static void main(String[] args) {
        Horse1 horse1 = new Horse1();
        horse1.walk();
    }
}

/* Interface:
  1. All fields in interface are public, static and final by default
  2. All methods are public & abstract by default
  3. A class that implements an interface must implement all the methods
  declared in the interface
  4. Interfaces support the functionality of multiple inheritance
 */

interface Animal1 {
    public void walk();
}

/*  Multilevel Inheritance: In java we implement this using interfaces
    It means child class access properties of multiple parent class
*/
interface Herbivore {

}

class Horse1 implements Animal1, Herbivore{
    public void walk(){
        System.out.println("Walks on 4 Legs");
    }
}
