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

    EditText txtVar1,txtVar2;
    Button btnAdd, btnSub, btnMulti, btnDivide, btnModulo;
    TextView txtAns;

    double var1, var2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        //calling process
        //declarations

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDivide = findViewById(R.id.btnDivide);
        btnModulo = findViewById(R.id.btnModulo);

        //Answer text view
        txtAns = findViewById(R.id.txtAnswer);

        //to make the button work (listener)

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //variable text boxes
        txtVar1 = findViewById(R.id.txtVariable1);
        txtVar2 = findViewById(R.id.txtVariable2);

        var1 = Double.parseDouble(txtVar1.getText().toString());
        var2 = Double.parseDouble(txtVar2.getText().toString());


        switch(v.getId()){
            case R.id.btnAdd:
                txtAns.setText(Double.toString(var1 + var2));

                break;
            case R.id.btnSub:
                txtAns.setText(Double.toString(var1 - var2));

                break;
            case R.id.btnMulti:
                txtAns.setText(Double.toString(var1 * var2));

                break;
            case R.id.btnDivide:
                txtAns.setText(Double.toString(var1 / var2));

                break;
            case R.id.btnModulo:
                txtAns.setText(Double.toString(var1 % var2));

                break;

        }

    }
    //Methods





}