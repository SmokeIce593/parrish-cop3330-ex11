/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many euros are you exchanging?");
        String euroString = input.nextLine();

        float euroamount = Float.parseFloat(euroString);

        System.out.print("What is the exchange rate?");
        String rateString = input.nextLine();

        float eurorate = Float.parseFloat(rateString);
        float usamount = eurorate * euroamount;

        System.out.printf("%.2f euros at an exchange rate of %.4f is", euroamount, eurorate);
        System.out.printf("\n%.2f U.S. dollars.", usamount);


    }
}
