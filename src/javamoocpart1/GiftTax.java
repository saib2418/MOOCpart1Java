package javamoocpart1;


import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double giftprice = Double.valueOf(scan.nextLine());
        double tax = 0.0;

        if (giftprice < 5000) {
            System.out.println("No tax!");
        } else if (giftprice >= 5000 && giftprice <= 25000) {
            tax = (100 + (giftprice - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (giftprice >= 25000 && giftprice <= 55000) {
            tax = (1700 + (giftprice - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        } else if (giftprice >= 55000 && giftprice <= 200000) {
            tax = (4700 + (giftprice - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (giftprice >= 200000 && giftprice <= 1000000) {
            tax = (22100 + (giftprice - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (giftprice >= 1000000) {
            tax = (142100 + (giftprice - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}
