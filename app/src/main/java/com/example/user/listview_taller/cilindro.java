package com.example.user.listview_taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cilindro extends AppCompatActivity {
    EditText radio,altura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        radio=findViewById(R.id.txtradio);
        altura=findViewById(R.id.txtaltura);

    }
    public void calcular(View v){
        double b = Double.parseDouble(altura.getText().toString());
        double a =Double.parseDouble(radio.getText().toString());
        double resultado = new metodos().volumen_cilindro(a,b);
        resultados p = new resultados("Volumen de un cilindro","Radio:" +a +", altura"+b,resultado);
        p.guarda();
        Toast.makeText(getApplicationContext(), "Resultado: "+resultado, Toast.LENGTH_SHORT).show();
    }

    public void borrar(View v){
        radio.setText("");
        altura.setText("");
    }
}
