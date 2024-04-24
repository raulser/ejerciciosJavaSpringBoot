package com.example.ejercicios.ejerciciosstream.ejercicio1stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioStream1 {

    public static void main(String[] args){

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> resultado = numeros.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(resultado);
    }

}
