package com.example.user.listview_taller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class principal extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iniciar_principal);
        lv = findViewById(R.id.lista_op);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent n = new Intent(principal.this,area.class);
                        startActivity(n);
                        break;
                    case 1:
                        Intent nn = new Intent(principal.this,volumen.class);
                        startActivity(nn);
                        break;
                    case 2:
                        Intent nnn = new Intent(principal.this,realizadas.class);
                        startActivity(nnn);
                        break;
                }
            }
        });
    }
}
