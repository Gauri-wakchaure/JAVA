package com.javapracticeworkspace;

public class String_Functions {
    public static void main(String args[]) {
        String firstName ="Gauri";
        String lastName ="Wakchaure";

        // Strings are Immutable in Java
        // Concat function
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Length function
        System.out.println(fullName.length());

        // CharAt function
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // Compare function
         String name1 =" Hello";
        String name2 = "Hello";
        if(name1.compareTo(name2) ==0) {
            System.out.println("Strings are Equal");
        }else{
            System.out.println("String are not Equal");
        }

        /* Compare using '=='
        String name1 = "Hello";
        String name2 = "Hello";
        if(name1 == name2) {
            System.out.println("Strings are Equal");
        }else{
            System.out.println("String are not Equal");
        } */

        // Substring
        String sentence = "I am Software Developer ";
        String name3 =sentence.substring(5);
        System.out.println(name3);

        // Contains
        System.out.println(name3.contains("hello"));
    }
}
