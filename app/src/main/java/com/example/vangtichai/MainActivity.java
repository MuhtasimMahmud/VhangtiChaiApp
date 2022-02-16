package com.example.vangtichai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine, clear;
    TextView amount, counter500, counter100, counter50, counter20, counter10, counter5, counter2, counter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Initialize();

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText("");
                clearAllAmountCounter();
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)zero.getText());
                calculate();
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)one.getText());
                calculate();
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)two.getText());
                calculate();
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)three.getText());
                calculate();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)four.getText());
                calculate();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)five.getText());
                calculate();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)six.getText());
                calculate();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)seven.getText());
                calculate();
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)eight.getText());
                calculate();
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.setText((String)amount.getText() + (String)nine.getText());
                calculate();
            }
        });
    }

    private void clearAllAmountCounter(){
        counter500.setText("0");
        counter100.setText("0");
        counter50.setText("0");
        counter20.setText("0");
        counter10.setText("0");
        counter5.setText("0");
        counter2.setText("0");
        counter1.setText("0");
    }

    private void calculate(){

        clearAllAmountCounter();
        int money = Integer.parseInt(amount.getText().toString());

        if(money >= 500){
            counter500.setText(String.valueOf(money/500));
            money = money % 500;
        }
        if(money >= 100){
            counter100.setText(String.valueOf(money/100));
            money = money % 100;
        }
        if(money >= 50){
            counter50.setText(String.valueOf(money/50));
            money = money % 50;
        }
        if(money >= 20){
            counter20.setText(String.valueOf(money/20));
            money = money % 20;
        }
        if(money >= 10){
            counter10.setText(String.valueOf(money/10));
            money = money % 10;
        }
        if(money >= 5){
            counter5.setText(String.valueOf(money/5));
            money = money % 5;
        }
        if(money >= 2){
            counter2.setText(String.valueOf(money/2));
            money = money % 2;
        }
        if(money >= 1){
            counter1.setText(String.valueOf(money/1));
        }


    }

    private void Initialize() {

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        clear = findViewById(R.id.clear);

        amount = findViewById(R.id.amount);
        counter500 = findViewById(R.id.counter500);
        counter100 = findViewById(R.id.counter100);
        counter50 = findViewById(R.id.counter50);
        counter20 = findViewById(R.id.counter20);
        counter10 = findViewById(R.id.counter10);
        counter5 = findViewById(R.id.counter5);
        counter2 = findViewById(R.id.counter2);
        counter1 = findViewById(R.id.counter1);
    }
}