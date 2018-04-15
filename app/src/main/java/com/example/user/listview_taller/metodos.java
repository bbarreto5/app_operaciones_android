package com.example.user.listview_taller;

/**
 * Created by User on 15/04/2018.
 */

public class metodos {
    public double area_cuadrado(double lado){
        return (lado*lado);
    }
    public double area_rectangulo(double base, double altura){
        return  (base*altura);
    }
    public double area_triangulo(double base, double altura){
        return  (base*altura)/2;
    }
    public double area_circulo(double radio){
        return (radio*radio)*Math.PI;
    }
    public double volumen_esfera(double radio){
        return (Math.pow(radio,3)*Math.PI*4)/3;
    }
    public double volumen_cilindro(double radio, double altura){
        return (Math.pow(radio,2)*Math.PI*altura);
    }
    public double volumen_cono(double radio, double altura){
        return (Math.pow(radio,2)*Math.PI*altura)/3;
    }
    public double volumen_cubo(double arista){
        return Math.pow(arista,3);
    }
}
