package com.example.ejercicios.ejerciciosstream.ejercicio20stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream20 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 10);
        int sumaParesMayoresQueDos = numeros.stream().filter(num -> num > 2 && num % 2 == 0).reduce(0, Integer::sum);
        System.out.println(sumaParesMayoresQueDos);
    }
}
