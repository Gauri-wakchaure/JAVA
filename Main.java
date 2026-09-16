package com.javapracticeworkspace;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Code starts from main function
        // Sout is used to print output
        System.out.println("Hello world");
        System.out.println("Gauri Wakchaure");

        //Variables: it is a container which is used to store something in a memory
        String name = "Gauri";
        int age = 22;
        System.out.println("Value of variable name is: "+name);
        System.out.println("Value of variable age is: "+age);

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

        /* Array: It is used to store collection of similar data elements
           It is a data structure
           Represented in Square brackets [] */
        int eng = 97;
        int hin = 96;
        int mar = 95;
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 96;
        marks[2] = 95;

        //length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //Initialize Array Directly Using Curly brackets
        int[] marksofStudent = {65, 74,98,30,90};

        // 2D Array
        int[][] finalmarks = {{45,67,78}, {87,90,54}};
        System.out.println(finalmarks[1][1]);

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

        //Operators: Use to Perform Operators
        //Arithmatic Operator
        int a = 23;
        int b = 65;
        System.out.println("Addition of a and b: "+(a+b));
        System.out.println("Subtraction of a and b: "+(a-b));
        System.out.println("Multiplication of a and b: "+(a*b));
        System.out.println("Division of a and b: "+(a/b));
        System.out.println("Modulus of a and b: "+(a%b));

        //Assignment Operator: " = "
        double ab = 54.90;

        //Unary Operator
        int num1 = 2;
        System.out.println(++num1);
        System.out.println(num1);

        System.out.println(--num1);
        System.out.println(num1);

        /*Comparison Operator
        It gives true or false values
        1. a==b  2. a!=b
        3. a<b   4. a>b
        5. a<=b  6. a>=b
        */

        // Math Class: It has inbuilt functions which helps us find some values
        //Find max number
        System.out.println(Math.max(54,90));
        System.out.println(Math.min(65,32));
        System.out.println((int)(Math.random()*100));

        // How to take INPUT?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age2 = sc.nextInt();
        System.out.println(age2);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String nameValue = sc1.next();
        System.out.println(nameValue);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Something about you...");
        String Something = sc2.nextLine();
        System.out.println(Something);

        //Conditional Statements
        //If, If else, If else if, Switch, nested if else
        // 1. If statement
        int studAge = 67;
        if(studAge>18){
            System.out.println("Student is Adult");
        }

        // 2. If Else Statement
        if(studAge >= 18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not Eligible for vote");
        }

        // Logical Operators: &&-AND OR-|| Not-!
        // 1. AND-&&
        int c = 23;
        int d = 67;
        if(c < 50 && d< 50){
            System.out.println("Both are less than 50");
        }else{
            System.out.println("both are not less than 50");
        }

        // 2. OR-||
        if(c < 50 || d< 50){
            System.out.println("Both are less than 50");
        }else{
            System.out.println("Only one value less than 50");
        }

        // 3. NOT-!
        boolean adult = false;
        if(!adult) {
            System.out.println("is adult");
        }else{
            System.out.println("not adult");
        }

        // if else if
        // Example-1
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Your Cash Amount: ");
        int cash = sc3.nextInt();

        if(cash < 10){
            System.out.println("Cannot Buy Anything");
            System.out.println("Get More Money");
        }
        else if(cash > 10 && cash < 50){
            System.out.println("Can Get Only One Item");
        }
        else{
            System.out.println("Can Get Both Items");
        }
        

        // Switch Statement
        int day = 5;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong Choice");
        }

        // Loops: We can use loops when we have to do some tasks repeatedly
        // For Loop
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        for(int j=20; j>=0; j--){
            System.out.println(j);
        }

        //While loop
        int s = 1;
        while(s<=25) {
            System.out.println(s);
            s++;
        }

        //Do while
        int k = 20;
        do{
            System.out.println(k);
            k++;
        }while(k<=20);

        // Break & Contine Keyword: Use to break and continue statements
        int i=0;
        while(true){
            if(i == 3){
                i = i+1;
                continue;
            }
            System.out.println(i);
            i = i +1;
            if(i > 5){
                break;
            }
        }

        // Exception: We can handle exceptions which we can handle by using try & catch block
        // We cannot handle errors
        // Try-Catch Block
        int [] marks1 = {34, 45,67,89,90};
        try {
            System.out.println(marks1[7]);
        }catch(Exception exception){
            System.out.println("Array index is Wrong");
        }
        System.out.println("Hello");

    }
}



