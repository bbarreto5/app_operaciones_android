package com.example.user.listview_taller;

import java.util.ArrayList;

/**
 * Created by User on 15/04/2018.
 */

public class bd {
    private static ArrayList<resultados> datos = new ArrayList<>();

    static void guardar(resultados n){
        datos.add(n);
    }

    static ArrayList lista(){
        return datos;
    }
}
