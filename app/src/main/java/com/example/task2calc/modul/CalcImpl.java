package com.example.task2calc.modul;

public class CalcImpl implements Calc {

    @Override
    public double perform(double arg1, double arg2, Operators operators) {
        switch (operators) {
            case ADD:
            return arg1+arg2;
            case SUB:
                return arg1-arg2;
            case MULT:
                return arg1*arg2;
            case DIV:
                return arg1/arg2;
        }
        return 0.0;
    }
}
