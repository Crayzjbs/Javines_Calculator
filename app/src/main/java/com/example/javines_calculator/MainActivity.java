package com.example.javines_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    //To be called later on
    //to be used variables

    EditText txtVariable1,txtVariable2;
    Button btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo;
    TextView txtAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        //calling process
        //declarations

        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnSubtract = findViewById(R.id.btnSubtract);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnModulo = findViewById(R.id.btnModulo);

        //to make the button work (listener)
        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        double txtVariable1=0;
        double txtVariable2=0;
        double txtAnswer=0;

        //variable text boxes
        EditText txtVar1 = findViewById(R.id.txtVariable1);
        EditText txtVar2 = findViewById(R.id.txtVariable2);
        TextView txtAns = findViewById(R.id.txtAnswer);

        txtVariable1= Double.parseDouble(txtVar1.getText().toString());
        txtVariable2 = Double.parseDouble(txtVar2.getText().toString());


        switch(v.getId()){
            case R.id.btnAdd:
                txtAns.setText(add(txtVariable1, txtVariable2));
                break;
            case R.id.btnSubtract:
                txtAns.setText(subtract(txtVariable1, txtVariable2));
                break;
            case R.id.btnMultiply:
                txtAns.setText(multiply(txtVariable1, txtVariable2));
                break;
            case R.id.btnDivide:
                txtAns.setText(divide(txtVariable1, txtVariable2));
                break;
            case R.id.btnModulo:
                txtAns.setText(modulo(txtVariable1, txtVariable2));
                break;

        }

    }
    //Methods
    String add(double var1, double var2){return String.valueOf(var1 + var2);}
    String subtract(double var1, double var2){return String.valueOf(var1 - var2);}
    String multiply(double var1, double var2){return String.valueOf(var1 * var2);}
    String divide(double var1, double var2){return String.valueOf(var1 / var2);}
    String modulo(double var1, double var2){return String.valueOf(var1 % var2);}

}