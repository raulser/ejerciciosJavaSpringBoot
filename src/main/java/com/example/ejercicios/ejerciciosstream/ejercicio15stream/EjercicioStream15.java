package com.example.ejercicios.ejerciciosstream.ejercicio15stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjercicioStream15 {

    public static void main(String[] args){
        List<List<Integer>> listas = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3));
        List<Integer> numerosUnicos = listas.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
        System.out.println(numerosUnicos);
    }

}
