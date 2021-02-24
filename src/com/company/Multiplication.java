package com.company;

public class Multiplication extends Operation {

    @Override
    public double execute(int num1, int num2) {
        double result = num1 * num2;
        return result;
    }
}
