package com.example.ejercicios.ejerciciosstream.ejercicio17stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream17 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5);
        boolean algunNegativo = numeros.stream().anyMatch(num -> num < 0);
        System.out.println(algunNegativo? "Existen números negativos": "No existen números negativos");
    }
}
