package com.example.user.listview_taller;

/**
 * Created by User on 15/04/2018.
 */

public class resultados {
    private String operacion;
    private String datos;
    private double resultado;

    public resultados(String operacion, String datos, double resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "resultados{" +
                "operacion='" + operacion + '\'' +
                ", datos='" + datos + '\'' +
                ", resultado='" + resultado + '\'' +
                '}';
    }

    public void guarda(){
        bd.guardar(this);
    }
}
