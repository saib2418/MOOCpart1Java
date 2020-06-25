package javamoocpart1;


import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String input = String.valueOf(scan.nextLine());
        
        System.out.println("Give an integer: ");
        int number = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double: ");
        double numb = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean value = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + input);
        System.out.println("You gave the integer " + number);
        System.out.println("You gave the double " + numb);
        System.out.println("You gave the boolean " + value);

    }
}
