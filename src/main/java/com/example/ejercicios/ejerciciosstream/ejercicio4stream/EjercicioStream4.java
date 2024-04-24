package com.example.ejercicios.ejerciciosstream.ejercicio4stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EjercicioStream4 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> resultado = numeros.stream().reduce((a, b) -> a * b);
        System.out.println(resultado);
    }

}
