public class typecast {
    
      public static void main(String[] args) {

// TypeCasting: One DataType to another
        // 2 Types of casting: 1.Implicit  2.Explicit
        // Implicit means java automatically done casting
        double price = 516.00;
        double  FP = price + 15;
        System.out.println(FP);

        //Explicit Casting: Means we manually convert one type to another but some data may lose
        int p = 110;
        int FP1 = p + (int)18.0;
        System.out.println(FP1);

        //Constants: To make value constant which cannot change
        final float piValue = 3.14F;
      }
}