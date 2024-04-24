package com.example.ejercicios.ejerciciosstream.ejercicio8stream;

import java.util.Arrays;
import java.util.List;

public class EjercicioStream8 {

    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5);
        boolean todosPositivos = numeros.stream().allMatch(num -> num > 0);
        System.out.println(todosPositivos);
    }

}
