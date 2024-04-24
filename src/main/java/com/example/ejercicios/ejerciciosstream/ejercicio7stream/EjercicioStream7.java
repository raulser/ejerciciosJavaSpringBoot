package com.example.ejercicios.ejerciciosstream.ejercicio7stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class EjercicioStream7 {

    public static void main(String[] args){
        List<Double> numeros = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        OptionalDouble media = numeros.stream().mapToDouble(Double::doubleValue).average();
        System.out.println(media);
    }

}
