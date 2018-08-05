package com.kodilla;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }
    public int subtract (int a, int b){
        return a - b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        System.out.println("Doing addition of " + a + " and " + b + " gives " + calculator.add(a, b));
        System.out.println("Doing subtraction of " + b + " from " + a + " gives " + calculator.subtract(a, b));
    }
}
