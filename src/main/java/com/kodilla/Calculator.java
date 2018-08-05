package com.kodilla;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int nwd(int a, int b) {
        int remainder = b;
        do {
            remainder = a % b;
            if (remainder == 0) {
                a = b;
                remainder = 0;
            } else {
                a = b;
                b = remainder;
            }
        } while (remainder != 0);
        return b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int a = 12;
        int b = 8;
        System.out.println("Doing addition of " + a + " and " + b + " gives " + calculator.add(a, b));
        System.out.println("Doing subtraction of " + b + " from " + a + " gives " + calculator.subtract(a, b));
        System.out.println("Performing NWD (the highest common denominator of " + a + " and " + b + " gives " + calculator.nwd(a, b));
    }
}
