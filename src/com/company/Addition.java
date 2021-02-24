package com.company;

public class Addition extends Operation {
    double result;

    @Override
    public double execute(int num1, int num2) {
        double result = num1 + num2;
        return result;
    }

}