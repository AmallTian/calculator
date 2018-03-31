package ru.education.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void diff() {
        Calculator calculator = new Calculator();
        calculator.diff(4,2);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void multi() {
        Calculator calculator = new Calculator();
        calculator.multi(2,2);
        assertEquals(4, calculator.getResult());
    }

    @Test
    public void div() {
        Calculator calculator = new Calculator();
        calculator.div(4,2);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void deg() {
        Calculator calculator = new Calculator();
        calculator.deg(2,3);
        assertEquals(8, calculator.getResult());
    }
}