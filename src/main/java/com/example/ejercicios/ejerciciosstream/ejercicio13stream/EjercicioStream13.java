package com.example.ejercicios.ejerciciosstream.ejercicio13stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjercicioStream13 {

    public static void main(String[] args){
        List<String> palabras = Arrays.asList("manzana", "pera", "banana", "melón", "piña");
        Map<Integer, Long> conteoPorLongitud = palabras.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(conteoPorLongitud);
    }

}
