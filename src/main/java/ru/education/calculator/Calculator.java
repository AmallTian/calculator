package ru.education.calculator;

public class Calculator {
    private int result;

    /*
     * Сложение
     * */
    public void add(int... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    /*
     * Вычитание
     * */
    public void diff(int param1, int param2) {
        this.result = Math.subtractExact(param1, param2);
    }

    /*
     * Умножение
     * */
    public void multi(int param1, int param2) {
        this.result = Math.multiplyExact(param1, param2);
    }

    /*
     * Деление
     * */
    public void div(int param1, int param2) {
        this.result = param1 / param2;
    }

    /*
     * Возведение в степень
     * */
    public void deg(int param1, int param2) {
        this.result = (int) Math.pow(param1, param2);
    }

    public int getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}
