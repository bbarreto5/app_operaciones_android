package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cuadrado extends AppCompatActivity {
    EditText lado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lado=findViewById(R.id.txtlados);
    }
    public void calcular(View v){

        double l =Double.parseDouble(lado.getText().toString());
        double resultado = new metodos().area_cuadrado(l);
        resultados p = new resultados("Area de un cuadrado","Lados:" +l,resultado);
        p.guarda();
        Toast.makeText(getApplicationContext(), "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
    }

    public void borrar(View v){
        lado.setText("");
    }
}
