package javamoocpart1;


import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points: ");
        int point = Integer.valueOf(scan.nextLine());

        if (point < 0) {
            System.out.println("Grade: impossible!");
        } else if (0 <= point && point <= 49) {
            System.out.println("Grade: failed");
        } else if (50 <= point && point <= 59 ) {
            System.out.println("Grade: 1");
        } else if (60 <= point && point <= 69) {
            System.out.println("Grade: 2");
        } else if (70 <= point && point <= 79) {
            System.out.println("Grade: 3");
        } else if (80 <= point && point <= 89) {
            System.out.println("Grade: 4");
        } else if (90 <= point && point <= 100) {
            System.out.println("Grade: 5");
        } else if (point > 100) {
            System.out.println("Grade: incredible!");
        }
    }
}
