package com.example.ejercicios.ejerciciosstream.ejercicio22stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream22 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, -3, 10, 12);
        boolean condicionesCumplidas = numeros.stream().anyMatch(num -> num < 0)
                && numeros.stream().allMatch(num -> num % 2 == 0)
                && numeros.stream().noneMatch(num -> num == 0);
        System.out.println("¿Se cumplen todas las condiciones?: " + condicionesCumplidas);
    }
}
