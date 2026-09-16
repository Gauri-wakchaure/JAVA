public class datatypes {
    
      public static void main(String[] args) {
/* DataTypes: It tells us type of variable like integer, string, boolean
        Types of DataTypes: 1.Primitive and Non-Primitive
        Byte- 1 to [-12 to 127]
        short - 2 bytes, int - 4 bytes, ong - 8 bytes float - 4 bytes
        double - 8 bytes, char - 2 bytes, boolean - 1 byte[true/false]
         */
        // Primitive DataTypes
        byte age1 = 30;
        int phone = 1234567890;
        long phone2 = 12345679077L;
        float pi = 3.15F;
        char letter = 'G';
        boolean isAdult = true;

        // Non-Primitive DataTypes
        /* Non-Primitive datatypes has their own methods that we can use to perform some operations,
        or we can get any value using them,
        It has not fixed size
        We have to declare it using new keyword */
        String name1 = "Priya";
        String name2 = new String("Siya");
        System.out.println(name2);
        System.out.println(name1.length());

        //String Concatenate
        String n1 = "Gauri";
        String n2 = " Wakchaure";
        String n3 = n1 + n2;
        System.out.println(n3);

        //charAt
        String v1 = "Ram Sharma";
        System.out.println(v1.charAt(2));

        //length
        System.out.println(v1.length());

        //replace
        // String are immutable that cannot change original string
        String v2 = v1.replace('m', 'j');
        System.out.println(v2);

        //substring
        System.out.println(v1.substring(2,6));
      }
    }