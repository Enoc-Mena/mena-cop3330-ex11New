/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex11;
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        double amount_from, amount_to, rate_from, rate_to;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        amount_from = scan.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("What is the exchange rate? ");
        rate_from = scan2.nextDouble();

        amount_to = amount_from * rate_from; //Current rate of exchange is $1.22 per 1 euro

        System.out.print(amount_from + " euros at an exchange rate of " + rate_from + " is " + amount_to + " U.S. dollars.");

    }

}
