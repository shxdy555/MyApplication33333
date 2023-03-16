package com.example.myapplication33333;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        num=(int)(Math.random()*100000);
        String cadena=String.valueOf(num);
        Toast.makeText(this,cadena,Toast.LENGTH_LONG).show();


    }
    public void comparar(View view){
        int valorIngresado=Integer.parseInt(et1.getText().toString());

        if (valorIngresado==num){
            Toast.makeText(this,"Numero correcto", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"incorrecto", Toast.LENGTH_LONG).show();

        }
    }


}