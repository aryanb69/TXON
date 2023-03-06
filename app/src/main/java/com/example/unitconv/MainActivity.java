package com.example.unitconv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNum;
    Button miles;
    Button meter;
    Button kilometers;
    Button centimeter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output= findViewById(R.id.output);
        EnterNum=findViewById(R.id.EnterNum);
        miles=findViewById(R.id.miles);
        meter=findViewById(R.id.meter);
        kilometers=findViewById(R.id.kilometers);
        centimeter=findViewById(R.id.centimeter);

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float meter=(number*1000);
                output.setText("Value in Meters :"+meter);
            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                double miles=(number/1.609);
                output.setText("Value in Miles :"+miles);
            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float kilometers=(number/1000);
                output.setText("Value in Kilometers :"+kilometers);
            }
        });
        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num= EnterNum.getText().toString();
                int number= Integer.parseInt(num);
                float centimeter=(number*100);
                output.setText("Value in Centimeters :"+centimeter);
            }
        });
    }
}