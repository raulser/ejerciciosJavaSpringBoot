package com.example.ejercicios.ejerciciosstream.ejercicio14stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream14 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        double raizProductoPares = numeros.stream().filter(num -> num % 2 == 0).reduce(1, (a, b) -> a * b).doubleValue();
        raizProductoPares = Math.sqrt(raizProductoPares);
        System.out.println(raizProductoPares);
    }

}
