package com.readmenow.androidsimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text=findViewById(R.id.number1Text); //sen bunlarin basindaki classs turlerini silmeseydi  java bunlarin global da tanimlaninndan daha farkli bir degisken oldugunu algilayacakti.
        number2Text=findViewById(R.id.number2Text);
        resultText=findViewById(R.id.resultText);

    }

    public void sum (View view) {

        String number1 = number1Text.getText().toString();
        int intNumber1=Integer.parseInt(number1);

        String number2 = number2Text.getText().toString();
        int intNumber2=Integer.parseInt(number2);

        int result=intNumber1+intNumber2;

        resultText.setText("Result: "+result);




    }

    public void deduct (View view) {
        String number1 = number1Text.getText().toString();
        int intNumber1=Integer.parseInt(number1);

        String number2 = number2Text.getText().toString();
        int intNumber2=Integer.parseInt(number2);

        int result=intNumber1-intNumber2;

        resultText.setText("Result: "+result);



    }


    //View parametresini eger bir method, bir gorunum tarafindan cagirilacaksa kullaniyoruz. Yani buton a yani gorunen butona tiklandiginda bir seylerin gorunmesini istiyorsak
    //kullanabilixouz.

    public void multiple (View view) {
        String number1 = number1Text.getText().toString();
        int intNumber1=Integer.parseInt(number1);

        String number2 = number2Text.getText().toString();
        int intNumber2=Integer.parseInt(number2);

        int result=intNumber1*intNumber2;

        resultText.setText("Result: "+result);



    }

    public void divide (View view) {
        String number1 = number1Text.getText().toString();
        int intNumber1=Integer.parseInt(number1);

        String number2 = number2Text.getText().toString();
        int intNumber2=Integer.parseInt(number2);

        int result=intNumber1/intNumber2;

        resultText.setText("Result: "+result);



    }










}