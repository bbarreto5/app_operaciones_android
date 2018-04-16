package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class rectangulo extends AppCompatActivity {
    EditText altura,base;
    ArrayList<EditText> red = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        altura = findViewById(R.id.txtaltura);
        base =findViewById(R.id.txtbase);
        red.add(altura);
        red.add(base);
    }
    public void calcular(View v){
        if(new metodos().validar(red,getString(R.string.error1),getString(R.string.error2))){
            double b = Double.parseDouble(base.getText().toString());
            double a =Double.parseDouble(altura.getText().toString());
            double resultado = new metodos().area_rectangulo(b,a);
            resultados p = new resultados(getString(R.string.a_rectangulo),
                    getString(R.string.base)+b +", "+getString(R.string.altura)+a,resultado);
            p.guarda();
            Toast.makeText(getApplicationContext(), getString(R.string.resultado)+": "+resultado, Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v){
        altura.setText("");
        base.setText("");
    }
}
