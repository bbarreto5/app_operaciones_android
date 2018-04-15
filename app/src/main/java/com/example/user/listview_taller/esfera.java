package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class esfera extends AppCompatActivity {
    EditText radio;
    ArrayList<EditText> red = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = findViewById(R.id.txtradio);
        red.add(radio);
    }
    public void calcular(View v){
        if(new metodos().validar(red,getString(R.string.error1),getString(R.string.error2))){
            double r =Double.parseDouble(radio.getText().toString());
            double resultado = new metodos().volumen_esfera(r);
            resultados p = new resultados("Volumen de una esfera","Volumen:" +r,resultado);
            p.guarda();
            Toast.makeText(getApplicationContext(), "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v){
        radio.setText("");
    }
}
