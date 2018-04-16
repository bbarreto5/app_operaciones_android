package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class cuadrado extends AppCompatActivity {
    EditText lado;
    ArrayList<EditText> red = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lado=findViewById(R.id.txtlados);
        red.add(lado);
    }
    public void calcular(View v){
        if(new metodos().validar(red,getString(R.string.error1),getString(R.string.error2))){
            double l =Double.parseDouble(lado.getText().toString());
            double resultado = new metodos().area_cuadrado(l);
            resultados p = new resultados(getString(R.string.a_cuadrado),
                    getString(R.string.area_cuadrado) +l,resultado);
            p.guarda();
            Toast.makeText(getApplicationContext(), getString(R.string.resultado)+": "+resultado, Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v){
        lado.setText("");
    }
}
