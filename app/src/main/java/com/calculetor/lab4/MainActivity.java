package com.calculetor.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private EditText num3;
    private TextView res;
    private Button add;

    private Button mul;
    private Button sub;
    private Button div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.editText1);
        num2=(EditText)findViewById(R.id.editText2);
        add=(Button) findViewById(R.id.add);
        div=(Button) findViewById(R.id.div);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        res=(TextView)findViewById(R.id.re);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int sum=number1-number2;
                res.setText(String.valueOf(sum));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                int number1=Integer.parseInt(num1.getText().toString());
                int number2=Integer.parseInt(num2.getText().toString());
                int sum=number1*number2;
                res.setText(String.valueOf(sum));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       res.setText("");
                                       double number1=Double.parseDouble(num1.getText().toString());
                                       double number2=Double.parseDouble(num2.getText().toString());
                                       double sum=number1/number2;
                                       res.setText(String.valueOf(sum));
                                   }

                               }


        );
        add.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       res.setText("");
                                       int number1=Integer.parseInt(num1.getText().toString());
                                       int number2=Integer.parseInt(num2.getText().toString());
                                       int sum=number1+number2;
                                       res.setText(String.valueOf(sum));
                                   }

                               }


        );
    }
}
