package ru.education.calculator;

import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculator cal = new Calculator();
            String exit = "n";
            while (!exit.equals("y")) {
                System.out.println("ВВедите первое значение:");
                int first = scanner.nextInt();
                System.out.println("ВВедите второе значение:");
                int second = scanner.nextInt();
                System.out.println("Какую операцию произвести? Сложение(+), Умножение(*), " +
                        "Деление(/), Вычитание(-), Возведение в степень(^)");
                String operation = scanner.next();
                switch (operation) {
                    case "+":
                        cal.add(first, second);
                        break;
                    case "-":
                        cal.diff(first, second);
                        break;
                    case "*":
                        cal.multi(first, second);
                        break;
                    case "/":
                        cal.div(first, second);
                        break;
                    case "^":
                        cal.deg(first, second);
                        break;
                }
                String op = null;
                switch (operation) {
                    case "+":
                        op = "Сумма равна ";
                        break;
                    case "-":
                        op = "Разность равна ";
                        break;
                    case "*":
                        op = "Произведение равно ";
                        break;
                    case "/":
                        op = "Деление равно ";
                        break;
                    case "^":
                        op = "в степени равно ";
                        break;
                }
                System.out.println(op + cal.getResult());
                cal.cleanResult();
                System.out.println("Хотите выйти из программы? y/n");
                exit = scanner.next();
                if (exit.equals("y")) {
                    System.out.println("Досвидания!!");
                }
            }
        }
    }
}
