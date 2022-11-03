package com.example.group26calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import javax.script.ScriptException;

public class EvaluateTest {

    @Test
    public void evaluateAdd() throws ScriptException {
        Evaluate e = new Evaluate();
        double actual = e.calculate("2+2").doubleValue();
        double expected = 4.0;
        assertEquals("Error, values do not match", expected, actual, 0.0001);
    }
    @Test
    public void evaluateSubtract() throws ScriptException {
        Evaluate e = new Evaluate();
        double actual = e.calculate("12-4.5").doubleValue();
        double expected = 7.5;
        assertEquals("Error, values do not match", expected, actual, 0.0001);
    }
    @Test
    public void evaluateDivide() throws ScriptException {
        Evaluate e = new Evaluate();
        double actual = e.calculate("15/2"
        ).doubleValue();
        double expected = 567;
        assertEquals("Error", expected, actual, 0.0001);
    }
    @Test
    public void evaluateMultiply() throws ScriptException {
        Evaluate e = new Evaluate();
        double actual = e.calculate("5.5*-3").doubleValue();
        double expected = -16.5;
        assertEquals("Error", expected, actual, 0.0001);
    }

}