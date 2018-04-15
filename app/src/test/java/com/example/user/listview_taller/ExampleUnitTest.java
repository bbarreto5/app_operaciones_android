package com.example.user.listview_taller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void area_cuadrado() throws Exception {
        assertEquals(16,new metodos().area_cuadrado(4),0);
    }

    @Test
    public void area_rectangulo() throws Exception {
        assertEquals(8,new metodos().area_rectangulo(4,2),0);
    }

    @Test
    public void area_triangulo() throws Exception {
        assertEquals(4,new metodos().area_triangulo(4,2),0);
    }
    @Test
    public void area_circulo() throws Exception {
        assertEquals(50.26,new metodos().area_circulo(4),1);
    }
    @Test
    public void volumen_esfera() throws Exception {
        assertEquals(268.08,new metodos().volumen_esfera(4),1);
    }
    @Test
    public void volumen_cilindro() throws Exception {
        assertEquals(50.27,new metodos().volumen_cilindro(2,4),1);
    }
    @Test
    public void volumen_cono() throws Exception {
        assertEquals(16.76,new metodos().volumen_cono(2,4),1);
    }
    @Test
    public void volumen_cubo() throws Exception {
        assertEquals(27,new metodos().volumen_cubo(3),0);
    }
}