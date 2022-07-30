package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner =new Scanner(in);

        System.out.println("A=   ");
        int a = scanner.nextInt();
        System.out.println("B=   ");
        int b =  scanner.nextInt();;
        System.out.println("C=    ");
        int c =  scanner.nextInt();;

        if (a > b) {
            if (a > c) {
                System.out.println("katta son a = " + a);
            } else {
                System.out.println("katta son c = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("katta son b = " + b);
            } else {
                System.out.println("katta son c = " + c);
            }
        }

        if (a < b) {
            if (a > c) {
                System.out.println("O'rtacha son a = " + a);
            } else {
                System.out.println("O'rtacha son c = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("O'rtacha son c = " + b);
            } else {
                System.out.println("O'rtacha son c = " + c);
            }
        }

        if (a < b) {
            if (a < c) {
                System.out.println("Kichik son a = " + a);
            } else {
                System.out.println("Kichik son c = " + c);
            }
        } else {
            if (b < c) {
                System.out.println("Kichik son c = " + b);
            } else {
                System.out.println("Kichik son c = " + c);
            }
        }
    }
}
