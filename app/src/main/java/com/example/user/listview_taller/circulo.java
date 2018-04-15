package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class circulo extends AppCompatActivity {
    EditText radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio=findViewById(R.id.txtradio);
    }
    public void calcular(View v){

        double r =Double.parseDouble(radio.getText().toString());
        double resultado = new metodos().area_circulo(r);
        resultados p = new resultados("Area de un circulo","Radio:" +r,resultado);
        p.guarda();
        Toast.makeText(getApplicationContext(), "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
    }

    public void borrar(View v){
        radio.setText("");
    }
}
