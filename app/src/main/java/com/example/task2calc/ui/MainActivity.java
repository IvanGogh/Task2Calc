package com.example.task2calc.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.task2calc.R;
import com.example.task2calc.modul.CalcImpl;
import com.example.task2calc.modul.Operators;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements Calcview{


    private TextView resultTxt;
    private CalcPresent presenter;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTxt=findViewById(R.id.result);
        presenter= new CalcPresent(this, new CalcImpl());
    Map<Integer,Integer> digits=new HashMap<>();
    digits.put(R.id.key_1,1);
    digits.put(R.id.key_2,2);
    digits.put(R.id.key_3,3);
    digits.put(R.id.key_4,4);
    digits.put(R.id.key_5,5);
    digits.put(R.id.key_6,6);
    digits.put(R.id.key_7,7);
    digits.put(R.id.key_8,8);
    digits.put(R.id.key_9,9);
    digits.put(R.id.key_0,0);

        View.OnClickListener digitClickListener= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onDigitPressed(digits.get(view.getId()));

            }
        };

    findViewById(R.id.key_1).setOnClickListener(digitClickListener);
    findViewById(R.id.key_2).setOnClickListener(digitClickListener);
    findViewById(R.id.key_3).setOnClickListener(digitClickListener);
    findViewById(R.id.key_4).setOnClickListener(digitClickListener);
    findViewById(R.id.key_5).setOnClickListener(digitClickListener);
    findViewById(R.id.key_6).setOnClickListener(digitClickListener);
    findViewById(R.id.key_7).setOnClickListener(digitClickListener);
    findViewById(R.id.key_8).setOnClickListener(digitClickListener);
    findViewById(R.id.key_9).setOnClickListener(digitClickListener);
    findViewById(R.id.key_0).setOnClickListener(digitClickListener);

    Map<Integer, Operators> operators=new HashMap<>();
    operators.put(R.id.key_plus,Operators.ADD);
    operators.put(R.id.key_minus,Operators.SUB);
    operators.put(R.id.key_divide,Operators.DIV);
    operators.put(R.id.key_multiply,Operators.MULT);

    View.OnClickListener operatorsClickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            presenter.onOperatorsPressed(operators.get(view.getId()));

        }
    };
    findViewById(R.id.key_plus).setOnClickListener(operatorsClickListener);
    findViewById(R.id.key_minus).setOnClickListener(operatorsClickListener);
    findViewById(R.id.key_divide).setOnClickListener(operatorsClickListener);
    findViewById(R.id.key_multiply).setOnClickListener(operatorsClickListener);

    findViewById(R.id.key_dot).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            presenter.onDotPressed();

        }
    });


    }

    @Override
    public void showResult(String result) {
resultTxt.setText(result);
    }
}
