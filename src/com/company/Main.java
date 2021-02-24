package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {

            System.out.print("Введите операцию: ");
            String operation = in.next();
            if (operation.equals("end")) {
                break;
            }
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            double result = 0;

            switch (operation) {
                case "+":
                    Addition addition = new Addition();
                    result = addition.execute(num1, num2);
                    break;
                case "-":
                    Subtraction subtraction = new Subtraction();
                    result = subtraction.execute(num1, num2);
                    break;
                case "*":
                    Multiplication multiplication = new Multiplication();
                    result = multiplication.execute(num1, num2);
                    break;
                case "/":
                    Division division = new Division();
                    result = division.execute(num1, num2);
                    break;
                default:
                    System.out.println("Введены некорректные данные");
            }
            System.out.println(result);


        }
    }
}
