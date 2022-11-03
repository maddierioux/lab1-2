package com.example.group26calculator;

import java.math.BigDecimal;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Evaluate {

    public ScriptEngine engine;

    public Evaluate(){
        engine = new ScriptEngineManager().getEngineByName("rhino");
    }

    public BigDecimal calculate(String expression) throws ScriptException {
        String result = engine.eval(expression).toString();
        return new BigDecimal(result);
    }
}
