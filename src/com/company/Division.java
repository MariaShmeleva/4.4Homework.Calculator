package com.company;

public class Division extends Operation {

    @Override
    public double execute(int num1, int num2) {
        double result = num1 / num2;
        return result;
    }
}
