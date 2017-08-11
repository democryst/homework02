package com.example.tngp17_001.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView signText, numberText;
    Button btn_val_1, btn_val_3, btn_val_5, btn_val_7, btn_val_9, btn_val_11, btn_plus, btn_minus, btn_clear;
    int number_int = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initinstances();


    }

    void btn_pass(Button b, String sign, String plus, String minus) {
        if (sign == plus) {
            Log.d("click", "if sign: " + sign);
            int btn_val = Integer.parseInt(b.getText().toString());
            number_int = number_int + btn_val;
            Log.d("click", "if number_int: " + number_int);
            numberText.setText(number_int + "");
        } else if (sign == minus) {
            int btn_val = Integer.parseInt(b.getText().toString());
            number_int = number_int - btn_val;
            if (number_int > 0) {
                numberText.setText(number_int + "");
            } else {
                numberText.setText(0 + "");
            }
        }
    }

    private void initinstances() {
        signText = (TextView) findViewById(R.id.signText);
        numberText = (TextView) findViewById(R.id.numberText);
        btn_val_1 = (Button) findViewById(R.id.btn_val_1);
        btn_val_3 = (Button) findViewById(R.id.btn_val_3);
        btn_val_5 = (Button) findViewById(R.id.btn_val_5);
        btn_val_7 = (Button) findViewById(R.id.btn_val_7);
        btn_val_9 = (Button) findViewById(R.id.btn_val_9);
        btn_val_11 = (Button) findViewById(R.id.btn_val_11);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_clear = (Button) findViewById(R.id.btn_clear);

        btn_val_1.setOnClickListener(this);
        btn_val_3.setOnClickListener(this);
        btn_val_5.setOnClickListener(this);
        btn_val_7.setOnClickListener(this);
        btn_val_9.setOnClickListener(this);
        btn_val_11.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String sign = signText.getText().toString();
        String plus = btn_plus.getText().toString();
        String minus = btn_minus.getText().toString();

        Log.d("sign", "sign: " + sign);
        if (v == btn_val_1) {
            btn_pass(btn_val_1, sign, plus, minus);
        } else if (v == btn_val_3) {
            btn_pass(btn_val_3, sign, plus, minus);
        } else if (v == btn_val_5) {
            btn_pass(btn_val_5, sign, plus, minus);
        } else if (v == btn_val_7) {
            btn_pass(btn_val_7, sign, plus, minus);
        } else if (v == btn_val_9) {
            btn_pass(btn_val_9, sign, plus, minus);
        } else if (v == btn_val_11) {
            btn_pass(btn_val_11, sign, plus, minus);
        } else if (v == btn_plus) {
            signText.setText(plus);
        } else if (v == btn_minus) {
            signText.setText(minus);
        } else if (v == btn_clear) {
            signText.setText("");
            numberText.setText("");
            number_int = 0;
        }
    }
}
