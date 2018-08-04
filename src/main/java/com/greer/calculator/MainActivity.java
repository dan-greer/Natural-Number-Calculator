package com.greer.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private char opFlag;
    private NaturalNumber firstVal = new NaturalNumber1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.action_bar_title);
    }

    public void enterZero(View view) {
        String zero = "0";
        generateNumber(zero);
    }
    public void enterOne(View view) {
        String one = "1";
        generateNumber(one);
    }
    public void enterTwo(View view) {
        String two = "2";
        generateNumber(two);
    }
    public void enterThree(View view) {
        String three = "3";
        generateNumber(three);
    }
    public void enterFour(View view) {
        String four = "4";
        generateNumber(four);
    }
    public void enterFive(View view) {
        String five = "5";
        generateNumber(five);
    }
    public void enterSix(View view) {
        String six = "6";
        generateNumber(six);
    }
    public void enterSeven(View view) {
        String seven = "7";
        generateNumber(seven);
    }
    public void enterEight(View view) {
        String eight = "8";
        generateNumber(eight);
    }
    public void enterNine(View view) {
        String nine = "9";
        generateNumber(nine);
    }

    public void addition(View view) {
        TextView numOnScreen = findViewById(R.id.textView);
        NaturalNumber valOnScreen = new NaturalNumber1(numOnScreen.getText().toString());
        numOnScreen.setText("0");
        firstVal.transferFrom(valOnScreen);
        setOpFlag('+');
    }

    public void subtraction(View view) {
        TextView numOnScreen = findViewById(R.id.textView);
        NaturalNumber valOnScreen = new NaturalNumber1(numOnScreen.getText().toString());
        numOnScreen.setText("0");
        firstVal.transferFrom(valOnScreen);
        setOpFlag('-');
    }

    public void equalButtonAction(View view) {
        TextView numOnScreen = findViewById(R.id.textView);
        NaturalNumber valOnScreen = new NaturalNumber1(numOnScreen.getText().toString());

        switch (opFlag) {
            case '+':
                firstVal.add(valOnScreen);
                break;
            case '-':
                firstVal.subtract(valOnScreen);
                break;
            default:
                numOnScreen.setText(R.string.op_error_msg);
        }
        numOnScreen.setText(firstVal.toString());

    }

    public void clearButtonAction(View view) {
        TextView numOnScreen = findViewById(R.id.textView);
        numOnScreen.setText("0");
    }

    private void setOpFlag(char toSet) {
        opFlag = toSet;
    }

    private void generateNumber(String toAdd) {

        TextView numOnScreen = findViewById(R.id.textView);
        if (numOnScreen.getText().equals("0")) {
            numOnScreen.setText(toAdd);
        } else {
            String updatedString = numOnScreen.getText().toString() + toAdd;
            numOnScreen.setText(updatedString);
        }

    }

}
