package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cubo extends AppCompatActivity {
    EditText arista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        arista = findViewById(R.id.txtarista);
    }
    public void calcular(View v){

        double r =Double.parseDouble(arista.getText().toString());
        double resultado = new metodos().volumen_cubo(r);
        resultados p = new resultados("Volumen de un cubo","Volumen:" +r,resultado);
        p.guarda();
        Toast.makeText(getApplicationContext(), "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
    }

    public void borrar(View v){
        arista.setText("");
    }
}
