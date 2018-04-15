package com.example.user.listview_taller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class volumen extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumen);
        lv=findViewById(R.id.lista_op);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent n = new Intent(volumen.this,esfera.class);
                        startActivity(n);
                        break;
                    case 1:
                        Intent nn = new Intent(volumen.this,cilindro.class);
                        startActivity(nn);
                        break;
                    case 2:
                        Intent nnn = new Intent(volumen.this,cono.class);
                        startActivity(nnn);
                        break;
                    case 3:
                        Intent nnnn = new Intent(volumen.this,cubo.class);
                        startActivity(nnnn);
                        break;
                }
            }
        });
    }
}
