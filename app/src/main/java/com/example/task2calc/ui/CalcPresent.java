package com.example.task2calc.ui;

import com.example.task2calc.modul.Calc;
import com.example.task2calc.modul.Operators;

public class CalcPresent {
    private Calcview view;
    private Calc calc;

    private double argOne;
    private Double argTwo;
    private Operators selectedOperator;

    public CalcPresent(Calcview view, Calc calc) {
        this.view = view;
        this.calc = calc;
    }


    public void onDigitPressed(int digit) {
       if (argTwo==null){
        argOne=argOne*10+digit;
        view.showResult(String.valueOf(argOne));}
       else {
           argTwo=argTwo*10+digit;
           view.showResult(String.valueOf(argTwo));}

    }

    public void onOperatorsPressed(Operators operators) {
if (selectedOperator!=null){
    argOne=calc.perform(argOne,argTwo,selectedOperator);
    view.showResult(String.valueOf(argOne));
}
    argTwo=0.0;
        selectedOperator=operators;


    }

    public void onDotPressed() {
    }
}
