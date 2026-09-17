/*  1. abstract class must be declared with abstract keyword
    2. It can have abstract and non-abstract methods
    3. It cannot be instantiated
    4. It can have constructor and static methods also
    5. It can have final methods which will force the
    subclass not to change the body of the methods
*/
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

    }
}

abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");

    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

