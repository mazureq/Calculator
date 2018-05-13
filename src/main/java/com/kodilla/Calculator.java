package com.kodilla;

public class Calculator {

    double a = 25;
    double b = 20;

    public double minus(){
        return a - b;
    }

    public double plus(){
        return a + b;
    }
    public static void main(String args[]) {

        Calculator myCalc = new Calculator();
        double result1 = myCalc.minus();
        double result2 = myCalc.plus();
        System.out.println(result1 + " " + result2);

    }
}
