package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class triangulo extends AppCompatActivity {
    EditText altura,base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        altura = findViewById(R.id.txtaltura);
        base =findViewById(R.id.txtbase);
    }

    public void calcular(View v){
        double b = Double.parseDouble(base.getText().toString());
        double a =Double.parseDouble(altura.getText().toString());
        double resultado = new metodos().area_triangulo(b,a);
        resultados p = new resultados("Area de un triangulo","Base:" +b +", altura"+a,resultado);
        p.guarda();
        Toast.makeText(getApplicationContext(), "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
    }

    public void borrar(View v){
        altura.setText("");
        base.setText("");
    }
}
